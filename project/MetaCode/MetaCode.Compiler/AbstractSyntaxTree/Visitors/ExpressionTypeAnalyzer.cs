using System;
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

        public CompilerService CompilerService { get; set; }

        public ExpressionTypeAnalyzer(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            CompilerService = compilerService;
            _currentScope = compilerService.GetGlobalScope();

            Initialize();
        }

        private void Initialize()
        {
            this
                .If<ConstantExpressionNode>((visitor, node) => node.Type)
                .If<UnaryExpressionNode>((visitor, node) => {
                    var op = node.Operator;

                    if (op is NegationOperatorNode) {
                        if (!visitor.VisitChild(node.Expression).IsLogical())
                            CompilerService.Error("Expression must be logical type!");

                        return typeof(Boolean);
                    }
                    CompilerService.Error("Not supported unary operator!");
                    return typeof(Object);
                })
                .If<BinaryExpressionNode>((visitor, node) => {
                    var op = node.Operator;
                    var left = visitor.VisitChild(node.Left);
                    var right = visitor.VisitChild(node.Right);

                    if (op is NumericBinaryOperatorNode) {
                        if (!left.IsNumeric())
                            CompilerService.Error("Left expression must be numeric type!");
                        if (!right.IsNumeric())
                            CompilerService.Error("Right expression must be numeric type!");

                        return typeof(Double);
                    }
                    if (op is RelationalBinaryOperatorNode) {
                        if (!left.IsNumeric())
                            CompilerService.Error("Left expression must be numeric type!");
                        if (!right.IsNumeric())
                            CompilerService.Error("Right expression must be numeric type!");

                        return typeof(Boolean);
                    }
                    if (op is LogicalBinaryOperatorNode) {
                        if (!left.IsLogical())
                            CompilerService.Error("Left expression must be logical type!");
                        if (!right.IsLogical())
                            CompilerService.Error("Right expression must be logical type!");

                        return typeof(Boolean);
                    }

                    CompilerService.Error("Not supported binary operator!");
                    return typeof(Object);
                })
                .If<IdentifierExpressionNode>((visitor, node) => {
                    var variableName = node.Name;
                    var variable = _currentScope.FindVariable(variableName);
                    if (variable != null)
                        return variable.Type;

                    CompilerService.Error(string.Format("Unrecognized variable: '{0}'", variableName));
                    return typeof(object);
                })
                .If<MemberExpressionNode>((visitor, node) => {
                    var members = node.Members;
                    var firstMember = visitor.VisitChild(members.First());

                    if (members.Length == 1)
                        return firstMember;

                    // TODO: Implement objects
                })
                .If<AssignmentExpressionNode>((visitor, node) => {
                    var left = visitor.VisitChild(node.LeftValue);
                    var right = visitor.VisitChild(node.RightValue);

                    if (left != right) {
                        CompilerService.Error("Wrong type of assignment");
                    }

                    return left;
                })
                .If<FunctionCallExpressionNode>((visitor, node) => {
                    var functionName = node.FunctionName.Name;
                    var function = _currentScope.FindFunction(functionName);

                    if (function == null) {
                        CompilerService.Error("Invalid function call!");
                        return null;
                    }

                    if (node.ActualParameters.Count() != function.FormalParameters.Length) {
                        CompilerService.Error("Invalid function call!");
                        return null;
                    }

                    node.ActualParameters.Select((parameter, index) => {
                        var type = visitor.VisitChild(parameter);
                        if (type != function.FormalParameters[index].Type)
                            CompilerService.Error("Invalid function parameter type!");

                        return parameter;
                    });

                    return function.ReturnType;
                })
                .If<BlockStatementNode>((visitor, node) => {
                    _currentScope = CompilerService.GetScopeByNode(node) ?? _currentScope;

                    foreach (var child in node.Children)
                        visitor.VisitChild(child);

                    return null;
                });

        }
    }
}

