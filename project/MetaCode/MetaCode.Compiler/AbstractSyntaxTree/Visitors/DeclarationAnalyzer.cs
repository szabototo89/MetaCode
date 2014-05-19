using System;
using System.CodeDom.Compiler;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.Commons;
using MetaCode.Compiler.Helpers;
using MetaCode.Compiler.Services;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Visitors
{
    public class DeclarationAnalyzer : TreeVisitorBase<DeclarationAnalyzer>
    {
        private CodeGenerator _codeGenerator;
        public CompilerService CompilerService { get; set; }
        public ExpressionTypeAnalyzer ExpressionTypeAnalyzer { get; set; }

        public Dictionary<string, Type> StandardTypes { get; protected set; }

        public DeclarationAnalyzer(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            CompilerService = compilerService;

            ExpressionTypeAnalyzer = new ExpressionTypeAnalyzer(compilerService);
            _codeGenerator = new CodeGenerator();

            InitializeStandardTypes();
            Initialize();
        }

        private void InitializeStandardTypes()
        {
            StandardTypes = new Dictionary<string, Type>();

            StandardTypes.Add("number", typeof(Double));
            StandardTypes.Add("any", typeof(Object));
            StandardTypes.Add("string", typeof(String));
            StandardTypes.Add("boolean", typeof(Boolean));
            StandardTypes.Add("array", typeof(IEnumerable));
        }

        private Type FindType(string name)
        {
            Type result;
            if (StandardTypes.TryGetValue(name, out result))
                return result;

            return null;
        }

        private void Initialize()
        {
            this
                .DefaultVisitor((visitor, node) =>
                {
                    foreach (var child in node.Children)
                        visitor.VisitChild(child);
                    return this;
                })
                .If<BlockStatementNode>((visitor, node) =>
                {
                    CompilerService.PushScope(node);
                    foreach (var child in node.Children)
                        visitor.VisitChild(child);
                    CompilerService.PopScope();
                    return this;
                })
                .If<MacroDeclarationStatementNode>((visitor, node) => this)
                .If<FunctionDeclarationStatementNode>((visitor, node) =>
                {
                    var scope = CompilerService.GetScope();

                    if (scope.FunctionDeclarations.Any(function => function.Name == node.FunctionName))
                    {
                        CompilerService.Error(string.Format("This function ({0}) is already defined!", node.FunctionName));
                        return this;
                    }

                    var formalParameters = GetFormalParameters(node.Parameters);
                    var functionDeclaration = scope.DeclareFunction(node.FunctionName, FindType(node.ReturnType.Type), formalParameters);

                    var functionScope = CompilerService.PushFunctionScope(node, functionDeclaration);

                    foreach (var parameter in formalParameters)
                        functionScope.DeclareVariable(parameter.Name, parameter.Type);

                    functionScope.DeclareVariable("result", FindType(node.ReturnType.Type));

                    foreach (var child in node.Children)
                        visitor.VisitChild(child);

                    CompilerService.PopScope();

                    return this;
                })
                .If<ObjectDeclarationStatementNode>((visitor, node) =>
                {
                    var scope = CompilerService.GetScope();

                    if (scope.TypeDeclarations.Any(obj => obj.Name == node.ObjectName))
                    {
                        CompilerService.Error(string.Format("This object ({0}) is already defined!", node.ObjectName));
                        return this;
                    }

                    var formalParameters = GetFormalParameters(node.Parameters);
                    scope.DeclareObjectType(node.ObjectName, formalParameters);

                    foreach (var child in node.Children)
                        visitor.VisitChild(child);

                    return this;
                })
                .If<AttributeDeclarationStatementNode>((visitor, node) =>
                {
                    var scope = CompilerService.GetScope();

                    if (scope.AttributeDeclarations.Any(attribute => attribute.Name == node.AttributeName))
                    {
                        CompilerService.Error("This attribute is already defined!");
                        return this;
                    }

                    var formalParameters = GetFormalParameters(node.Parameters);
                    scope.DeclareAttributeType(node.AttributeName, formalParameters);

                    foreach (var child in node.Children)
                        visitor.VisitChild(child);

                    return this;
                })
                .If<VariableDeclarationStatementNode>((visitor, node) =>
                {
                    var scope = CompilerService.GetScope();

                    if (scope.VariableDeclarations.Any(variable => variable.Name == node.VariableName))
                    {
                        CompilerService.Error("This variable has already been defined!");
                        return this;
                    }

                    var type = FindType(node.VariableType.Type);
                    var rightExpression = ExpressionTypeAnalyzer.VisitChild(node.InitialValue);

                    if (type == null || !rightExpression.IsAssignableFrom(type)) {
                        CompilerService.Error(string.Format("Wrong type of initial value of {0}: {1}!", node.VariableName, GeneratedCode(node)));
                        return this;
                    }

                    scope.DeclareVariable(node.Identifier.Name, type);

                    foreach (var child in node.Children)
                        visitor.VisitChild(child);

                    return this;
                });
        }

        private string GeneratedCode(Node node)
        {
            if (node == null) throw new ArgumentNullException("node");

            return _codeGenerator.Visit(node);
        }

        private FormalParameter[] GetFormalParameters(IEnumerable<FormalParameterNode> parameters)
        {
            return parameters.Select(parameter => new FormalParameter(parameter.Name, FindType(parameter.TypeName.Type)))
                             .ToArray();
        }
    }
}
