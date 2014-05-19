using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Operators;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Logical;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Numerics;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Relational;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.Commons;
using MetaCode.Compiler.Helpers;
using MetaCode.Compiler.Services;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Visitors
{
    public class ExpressionTypeAnalyzer : TreeVisitorBase<Type>
    {
        private Scope _currentScope;
        private readonly CodeGenerator _codeGenerator;

        public CompilerService CompilerService { get; set; }

        public ExpressionTypeAnalyzer(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            CompilerService = compilerService;
            _currentScope = compilerService.GetGlobalScope();
            _codeGenerator = new CodeGenerator();

            Initialize();
        }

        private void Initialize()
        {
            this
                .If<MacroDeclarationStatementNode>((visitor, node) => null)
                .If<ConstantExpressionNode>((visitor, node) => node.Type)
                .If<UnaryExpressionNode>((visitor, node) =>
                {
                    var op = node.Operator;

                    if (op is NegationOperatorNode)
                    {
                        if (!visitor.VisitChild(node.Expression).IsLogical())
                            CompilerService.Error(string.Format("Expression must be logical type: {0}!", GenerateCode(node)));

                        return typeof(Boolean);
                    }
                    CompilerService.Error(string.Format("Not supported unary operator: {0}!", GenerateCode(node)));
                    return typeof(Object);
                })
                .If<BinaryExpressionNode>((visitor, node) =>
                {
                    var op = node.Operator;
                    var left = visitor.VisitChild(node.Left);
                    var right = visitor.VisitChild(node.Right);

                    if (op is NumericBinaryOperatorNode)
                    {
                        if (!left.IsNumeric())
                            CompilerService.Error("Left expression must be numeric type!");
                        if (!right.IsNumeric())
                            CompilerService.Error("Right expression must be numeric type!");

                        return typeof(Double);
                    }
                    if (op is RelationalBinaryOperatorNode)
                    {
                        if (!left.IsNumeric())
                            CompilerService.Error("Left expression must be numeric type!");
                        if (!right.IsNumeric())
                            CompilerService.Error("Right expression must be numeric type!");

                        return typeof(Boolean);
                    }
                    if (op is LogicalBinaryOperatorNode)
                    {
                        if (!left.IsLogical())
                            CompilerService.Error("Left expression must be logical type!");
                        if (!right.IsLogical())
                            CompilerService.Error("Right expression must be logical type!");

                        return typeof(Boolean);
                    }

                    CompilerService.Error(string.Format("Not supported binary operator: {0}", GenerateCode(node)));
                    return typeof(Object);
                })
                .If<IdentifierExpressionNode>((visitor, node) =>
                {
                    var variableName = node.Name;
                    var variable = _currentScope.FindVariable(variableName);
                    if (variable != null)
                        return variable.Type;

                    CompilerService.Error(string.Format("Unrecognized variable: '{0}'", variableName));
                    return typeof(object);
                })
                .If<MemberExpressionNode>((visitor, node) =>
                {
                    var members = node.Members;
                    var firstMember = members.First();

                    if (members.Length == 1)
                        return visitor.VisitChild(firstMember);

                    var variable = CompilerService.FindVariable(firstMember.Name);

                    return typeof(object);
                    // TODO: Implement objects
                })
                .If<AssignmentExpressionNode>((visitor, node) =>
                {
                    var left = visitor.VisitChild(node.LeftValue);
                    var right = visitor.VisitChild(node.RightValue);

                    var assignment = GenerateCode(node);

                    if (!left.IsAssignableFrom(right))
                        CompilerService.Error(string.Format("Wrong type of assignment: {0}", assignment));

                    return left;
                })
                .If<FunctionCallExpressionNode>((visitor, node) =>
                {
                    var functionName = node.FunctionName.Name;
                    var function = _currentScope.FindFunction(functionName);

                    string INVALID_FUNCTION_CALL_MESSAGE = string.Format("Invalid function call: {0}!", GenerateCode(node));
                    if (function == null)
                    {
                        CompilerService.Error(INVALID_FUNCTION_CALL_MESSAGE);
                        return null;
                    }

                    if (node.ActualParameters.Count() != function.FormalParameters.Length)
                    {
                        CompilerService.Error(INVALID_FUNCTION_CALL_MESSAGE);
                        return null;
                    }

                    node.ActualParameters.Foreach((parameter, index) =>
                    {
                        var type = visitor.VisitChild(parameter);
                        if (!function.FormalParameters[index].Type.IsAssignableFrom(type))
                            CompilerService.Error("Invalid function parameter type!");
                    });

                    return function.ReturnType;
                })
                .If<ReturnStatementNode>((visitor, node) =>
                {
                    var expressionType = visitor.VisitChild(node.ReturnExpression);
                    var functionScope = CompilerService.GetFunctionScope(_currentScope);
                    if (functionScope == null)
                    {
                        CompilerService.Error("Invalid use of return statement!");
                        return null;
                    }

                    if (expressionType != functionScope.Function.ReturnType)
                    {
                        CompilerService.Error("Invalid expression type of return statement!");
                        return null;
                    }

                    return expressionType;
                })
                .If<BlockStatementNode>((visitor, node) =>
                {
                    _currentScope = CompilerService.GetScopeByNode(node) ?? _currentScope;

                    foreach (var child in node.Children)
                        visitor.VisitChild(child);

                    return null;
                });

        }

        private string GenerateCode(Node node)
        {
            return _codeGenerator.Visit(node);
        }
    }
}

