using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CommonLib.Extensions;
using CommonLib.WPF;
using MetaCode.Compiler;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Visitors;
using MetaCode.Compiler.Services;
using MetaCode.Compiler.Visitors;

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

        private MetaCodeCompiler _compiler;
        private ActionCommand _compileCommand;
        private string _output;
        private ActionCommand _clearOutputCommand;

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
            _compiler = new MetaCodeCompiler();
            CompilerService = CompilerService.Instance;
            MacroInterpreter = new MacroInterpreter(CompilerService);
            CodeInterpreter = new CodeInterpreter(CompilerService);
            CodeGenerator = new CodeGenerator();

            InitializeFunctions();
        }

        private void InitializeFunctions()
        {
            var context = MacroInterpreter.InterpreterContext;
            context.DeclareNativeFunction("debug", new Func<object, object>(value =>
            {
                WriteLineToOutput(value.ToString());
                return null;
            }));
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
                            var node = ParseWithAbstractTreeVisitor(_compiler, OriginalSourceCode);
                            MacroInterpreter.VisitChild(node as CompilationUnit);
                            GeneratedSourceCode = CodeGenerator.Visit(MacroInterpreter.Root);
                        }
                        catch (Exception e)
                        {
                            Console.WriteLine(e);
                        }
                    });
                }
                return _compileCommand;
            }
        }
    }
}
