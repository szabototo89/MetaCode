using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Threading;
using CommonLib.Extensions;
using CommonLib.WPF;
using MetaCode.Compiler;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Visitors;
using MetaCode.Compiler.Interpreter;
using MetaCode.Compiler.Services;
using MetaCode.Compiler.Visitors;
using MetaCode.Core;

namespace MetaCode.CodeVisualizer.ViewModels
{
    public class MainViewModel : ViewModelBase
    {
        private string _originalSourceCode;
        private string _generatedSourceCode;
        public CodeGenerator CodeGenerator { get; set; }

        public CompilerService CompilerService { get; set; }

        public MacroInterpreter MacroInterpreter { get; set; }

        public CodeInterpreter CodeInterpreter { get; set; }

        public SemanticParser SemanticParser { get; set; }

        private MetaCodeCompiler _compiler;
        private ActionCommand _compileCommand;
        private string _output;
        private ActionCommand _clearOutputCommand;
        private ObservableCollection<string> _messages;

        private Node ParseWithAbstractTreeVisitor(MetaCodeCompiler compiler, string source)
        {
            return compiler.ParseWithVisitor<Node, AbstractTreeVisitor>(source, () => new AbstractTreeVisitor(CompilerService.Instance));
        }

        public MetaCodeCompiler Compiler { get; set; }

        public void ClearOutput()
        {
            Output = string.Empty;
        }

        public void WriteLineToOutput(string line)
        {
            Output += line + Environment.NewLine;
        }

        public MainViewModel()
        {
            InitializeCompiler();
            Messages = new ObservableCollection<string>();
        }

        private void InitializeCompiler()
        {
            _compiler = new MetaCodeCompiler();
            CompilerService = CompilerService.Instance;
            MacroInterpreter = new MacroInterpreter(CompilerService);
            CodeInterpreter = new CodeInterpreter(CompilerService);
            CodeGenerator = new CodeGenerator();
            SemanticParser = new SemanticParser(CompilerService);

            InitializeFunctions();
        }

        private void InitializeFunctions()
        {
            InitializeInterpreterContext(MacroInterpreter.InterpreterContext, CodeInterpreter.InterpreterContext);
        }

        private void InitializeInterpreterContext(params InterpreterContext[] contexts)
        {
            if (contexts == null)
                throw new ArgumentNullException("context");

            foreach (var context in contexts)
            {
                context.DeclareNativeFunction("debug", new Func<object, object>(value =>
                {
                    WriteLineToOutput(value.ToString());
                    return null;
                }));
            }
        }

        public string OriginalSourceCode
        {
            get { return _originalSourceCode; }
            set
            {
                _originalSourceCode = value;
                OnPropertyChanged(() => OriginalSourceCode);
            }
        }

        public string GeneratedSourceCode
        {
            get { return _generatedSourceCode; }
            set
            {
                _generatedSourceCode = value;
                OnPropertyChanged(() => GeneratedSourceCode);
            }
        }

        public string Output
        {
            get { return _output; }
            set
            {
                _output = value;
                OnPropertyChanged(() => Output);
            }
        }

        public ActionCommand ClearOutputCommand
        {
            get
            {
                if (_clearOutputCommand == null)
                {
                    _clearOutputCommand = new ActionCommand(ClearOutput);
                }
                return _clearOutputCommand;
            }
        }

        public ObservableCollection<string> Messages
        {
            get { return _messages; }
            set
            {
                _messages = value;
                OnPropertyChanged(() => Messages);
            }
        }

        public ActionCommand CompileCommand
        {
            get
            {
                if (_compileCommand == null)
                {
                    _compileCommand = new ActionCommand(() =>
                    {
                        try
                        {
                            InitializeCompiler();
                            Messages.Clear();
                            CompilerService.Errors.Clear();
                            var node = ParseWithAbstractTreeVisitor(_compiler, OriginalSourceCode);
                            Messages.Add("[INFO] Macro interpretation has started ...");
                            MacroInterpreter.VisitChild(node as CompilationUnit);

                            if (!CompilerService.HasError)
                            {
                                Messages.Add("[INFO] Code generation has started ...");
                                GeneratedSourceCode = CodeGenerator.Visit(MacroInterpreter.Root);

                                if (!CompilerService.HasError)
                                {
                                    Messages.Add("[INFO] Semantic parsing has started ...");
                                    CompilerService = new CompilerService();
                                    SemanticParser = new SemanticParser(CompilerService);
                                    SemanticParser.Visit(MacroInterpreter.Root);
                                    Messages.Add("[INFO] Code interpreter has started ...");
                                    if (!CompilerService.HasError)
                                    {
                                        Task.Run(() =>
                                        {
                                            CodeInterpreter.VisitChild(MacroInterpreter.Root);
                                        });
                                    }
                                }
                            }
                        }
                        catch (Exception ex)
                        {
                            Console.WriteLine(ex);
                            Messages.Add("[RUNTIME] " + ex.Message);
                        }
                        finally
                        {
                            CompilerService.Errors.ForEach(error => Messages.Add("[COMPILER] " + error));
                        }
                    });
                }
                return _compileCommand;
            }
        }
    }
}
