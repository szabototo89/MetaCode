using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;
using MetaCode.Compiler.AbstractSyntaxTree.Constants;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Operators;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Logical;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Numerics;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Relational;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.Grammar;
using MetaCode.Compiler.Helpers;
using MetaCode.Compiler.Interpreter;
using MetaCode.Compiler.Services;
using MetaCode.Compiler.Visitors;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Visitors
{
    public class MacroInterpreter : TreeVisitorBase<MacroInterpreter>
    {
        public CompilerService CompilerService { get; set; }

        public InterpreterContext InterpreterContext { get; protected set; }
        private readonly CodeInterpreter _codeInterpreter;
        private readonly Stack<object> _expressionStack;

        private bool _isInInterpreterMode;

        public CompilationUnit Root { get; protected set; }

        public MacroInterpreter(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            _isInInterpreterMode = false;

            CompilerService = compilerService;
            _expressionStack = new Stack<object>();
            _codeInterpreter = new CodeInterpreter(compilerService);
            InterpreterContext = _codeInterpreter.InterpreterContext;

            Initialize();
            InitializeNativeFunctions();
        }

        private void InitializeNativeFunctions()
        {
            InterpreterContext.DeclareNativeFunction("convertToString", new Func<object, object>(value => {
                var codeGenerator = new CodeGenerator();

                if (!(value is IEnumerable<Node>)) {
                    CompilerService.Error("Invalid use of convertToString. The actual parameter is not AST!");
                    return Enumerable.Empty<Node>();
                }

                var result = (value as IEnumerable<Node>).Select(codeGenerator.Visit);
                return result;
            }));

            InterpreterContext.DeclareNativeFunction("toSyntaxTree", new Func<object, object>(value => {
                var compiler = new MetaCodeCompiler();
                return compiler.ParseWithVisitor<Node, AbstractTreeVisitor>(value.ToString(), () => new AbstractTreeVisitor(CompilerService.Instance));
            }));

            InterpreterContext.DeclareNativeFunction("find", new Func<object, object, object>((tree, filter) => {
                if (!(tree is Node) && !(tree is string))
                    throw new Exception("The first parameter must be a node or string!");

                if (!filter.Is<string>())
                    throw new Exception("The second parameter must be a string!");

                var treeSelectorCompiler = new TreeSelectorCompiler();
                var selectors = treeSelectorCompiler.Parse(filter.ToString());
                var result = new List<Node>();

                foreach (var selector in selectors) {
                    if (tree is Node)
                        result.AddRange(selector.SelectNode(tree.As<Node>()));
                    else {
                        var compiler = new MetaCodeCompiler();
                        var node = compiler.ParseWithVisitor<Node, AbstractTreeVisitor>(
                                               tree.ToString(),
                                               () => new AbstractTreeVisitor(CompilerService.Instance));

                        result.AddRange(selector.SelectNode(node));
                    }
                }

                return result;
            }));

            InterpreterContext.DeclareNativeFunction("appendTo", new Func<object, object, object>((that, treeDestination) => {
                return GetParameterByType<IEnumerable<Node>>(that, "Invalid first argument of appendTo()", nodes => {
                    return GetParameterByType<IEnumerable<Node>>(treeDestination, "Invalid second argument of appendTo()", destinations => {
                        IEnumerable<Node> result = Enumerable.Empty<Node>();

                        foreach (var destination in destinations) {
                            destination.AddChildren(nodes);
                        }
                        return null;
                    });
                });
            }));

            InterpreterContext.DeclareNativeFunction("parent", new Func<object, object>(arg => {
                return GetParameterByType<IEnumerable<Node>>(arg, "Invalid argument of parent()", nodes => {
                    var result = nodes.Select(node => node.Parent);
                    return result;
                }) ?? GetParameterByType<Node>(arg, node => node.Parent);
            }));
        }

        private object GetParameterByType<TResult>(object that, Func<TResult, object> func)
            where TResult : class
        {
            return GetParameterByType<TResult>(that, string.Empty, func);
        }

        private object GetParameterByType<TResult>(object that, string errorMessage, Func<TResult, object> func)
            where TResult : class
        {
            var result = (that as TResult);
            if (result == null && !string.IsNullOrWhiteSpace(errorMessage)) {
                CompilerService.Error(errorMessage);
                return null;
            }
            return func(result);
        }

        private void Initialize()
        {
            /*this.
                DefaultVisitor((visitor, node) => {
                    node.Is<CompilationUnit>(unit => Root = unit);

                    foreach (var child in node.Children)
                        visitor.VisitChild(child);
                    return this;
                })
                .If<MacroDeclarationStatementNode>((visitor, node) => {
                    _isInInterpreterMode = true;

                    var treeSelector = new TreeSelectorCompiler();

                    foreach (var parameter in node.FormalParameters) {
                        var selectors = treeSelector.Parse(parameter.Selector);
                        var value = new List<Node>();

                        foreach (var selector in selectors)
                            value.AddRange(selector.SelectNode(Root));

                        InterpreterContext.DeclareVariable(parameter.Name, value);
                    }

                    foreach (var child in node.Children)
                        visitor.VisitChild(child);
                    _isInInterpreterMode = false;
                    return this;
                })
                .If<FunctionDeclarationStatementNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;



                    return this;
                })
                .If<UnaryExpressionNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    visitor.VisitChild(node.Expression);
                    var op = node.Operator;
                    var expression = _expressionStack.Pop();

                    if (op is LogicalUnaryOperatorNode) {
                        if (!expression.GetType().IsLogical())
                            CompilerService.Error("Expression must be logical type!");

                        if (op is NegationOperatorNode) {
                            bool result = !expression.Cast<bool>();
                            _expressionStack.Push(result);
                        }
                    }

                    return this;
                })
                .If<BinaryExpressionNode>((visitor, node) => {
                    visitor.VisitChild(node.Left);
                    visitor.VisitChild(node.Right);

                    var op = node.Operator;

                    var right = _expressionStack.Pop();
                    var left = _expressionStack.Pop();

                    if (op is NumericBinaryOperatorNode) {
                        if (left is string || right is string) {
                            var result = (left ?? string.Empty).ToString() + (right ?? string.Empty).ToString();
                            _expressionStack.Push(result);
                        }
                        else {
                            if (!left.GetType().IsNumeric())
                                CompilerService.Error("Left expression must be numeric type!");
                            if (!right.GetType().IsNumeric())
                                CompilerService.Error("Right expression must be numeric type!");

                            double result = 0;
                            var leftValue = left.Cast<double>();
                            var rightValue = right.Cast<double>();

                            if (op is AdditionOperatorNode)
                                result = leftValue + rightValue;
                            else if (op is SubtractionOperatorNode)
                                result = leftValue - rightValue;
                            else if (op is MultiplicationOperatorNode)
                                result = leftValue * rightValue;
                            else if (op is DivisionOperatorNode)
                                result = leftValue / rightValue;

                            _expressionStack.Push(result);
                        }
                    }
                    else if (op is RelationalBinaryOperatorNode) {
                        if (!left.GetType().IsNumeric())
                            CompilerService.Error("Left expression must be numeric type!");
                        if (!right.GetType().IsNumeric())
                            CompilerService.Error("Right expression must be numeric type!");

                        bool result = false;
                        var leftValue = left.Cast<double>();
                        var rightValue = right.Cast<double>();

                        var epsilon = 0.01;

                        if (op is EqualityOperatorNode)
                            result = leftValue == rightValue;
                        else if (op is InequalityOperatorNode)
                            result = leftValue != rightValue;
                        else if (op is LessThanOperatorNode)
                            result = leftValue < rightValue;
                        else if (op is GreaterThanOperatorNode)
                            result = leftValue > rightValue;
                        else if (op is LessThanOrEqualOperatorNode)
                            result = leftValue <= rightValue;
                        else if (op is GreaterThanOrEqualOperatorNode)
                            result = leftValue >= rightValue;

                        _expressionStack.Push(result);
                    }
                    else if (op is LogicalBinaryOperatorNode) {
                        if (!left.GetType().IsLogical())
                            CompilerService.Error("Left expression must be logical type!");
                        if (!right.GetType().IsLogical())
                            CompilerService.Error("Right expression must be logical type!");

                        bool result = false;
                        var leftValue = left.Cast<bool>();
                        var rightValue = right.Cast<bool>();

                        if (op is ConjunctionBinaryOperatorNode)
                            result = leftValue && rightValue;
                        else if (op is DisjunctionOperatorNode)
                            result = leftValue || rightValue;

                        _expressionStack.Push(result);
                    }

                    return this;
                })
                .If<AssignmentExpressionNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    var variable = node.LeftValue.Members.First().Name;
                    visitor.VisitChild(node.RightValue);

                    InterpreterContext.SetValueOfVariable(variable, _expressionStack.Pop());

                    return this;
                })
                .If<ArrayConstantLiteralNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    foreach (var value in node.Value)
                        visitor.VisitChild(value);

                    var values = new object[node.Value.Length];

                    for (int i = 0; i < node.Value.Length; i++)
                        values[node.Value.Length - 1 - i] = _expressionStack.Pop();

                    _expressionStack.Push(values.ToArray());

                    return this;
                })
                .If<ConstantExpressionNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    if (node.Constant is ArrayConstantLiteralNode) {
                        visitor.VisitChild(node.Constant);
                    }
                    else {
                        var value = node.Constant.Value;
                        _expressionStack.Push(value);
                    }

                    return this;
                })
                .If<IdentifierExpressionNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    var name = node.Name;
                    var value = InterpreterContext.GetValueOfVariable(name);
                    _expressionStack.Push(value);

                    return this;
                })
                .If<VariableDeclarationStatementNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    var name = node.VariableName;
                    visitor.VisitChild(node.InitialValue);
                    var value = _expressionStack.Pop();

                    InterpreterContext.DeclareVariable(name, value);

                    return this;
                })
                .If<ForeachLoopStatementNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    var variable = node.LoopVariable.Name;

                    InterpreterContext.PushBlock();
                    InterpreterContext.DeclareVariable(variable, null);

                    visitor.VisitChild(node.Expression);
                    var array = _expressionStack.Pop() as IEnumerable;

                    foreach (var value in array) {
                        InterpreterContext.SetValueOfVariable(variable, value);
                        visitor.VisitChild(node.Body);
                    }

                    InterpreterContext.PopBlock();

                    return this;
                })
                .If<MacroCallExpressionNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    var name = node.FunctionName.Name;
                    var result = InterpreterContext.InvokeMacroFunction(name, node.ActualParameters);
                    _expressionStack.Push(result);

                    return this;
                })
                .If<FunctionCallExpressionNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    var name = node.FunctionName.Name;
                    foreach (var param in node.ActualParameters)
                        visitor.VisitChild(param);

                    var parameters = new List<object>();

                    for (int i = 0; i < node.ActualParameters.Count(); i++)
                        parameters.Add(_expressionStack.Pop());

                    var result = InterpreterContext.InvokeFunction(name, parameters.ToArray().Reverse());
                    _expressionStack.Push(result);

                    return this;
                })
                .If<WhileLoopStatementNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    visitor.VisitChild(node.ConditionExpression);
                    var condition = _expressionStack.Pop().Cast<bool>();

                    while (condition) {
                        visitor.VisitChild(node.Body);
                        visitor.VisitChild(node.ConditionExpression);

                        condition = _expressionStack.Pop().Cast<bool>();
                    }

                    return this;
                })
                .If<BlockStatementNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    InterpreterContext.PushBlock();

                    foreach (var child in node.Children)
                        visitor.VisitChild(child);

                    InterpreterContext.PopBlock();

                    return this;
                })
                .If<IfStatementNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    visitor.VisitChild(node.ConditionExpression);

                    if (!_expressionStack.Peek().Is<bool>())
                        return this;

                    var condition = _expressionStack.Pop().Cast<bool>();

                    if (condition)
                        visitor.VisitChild(node.TrueStatementNode);
                    else
                        visitor.VisitChild(node.FalseStatementNode);

                    return this;
                });*/

            this
                .DefaultVisitor((visitor, node) => {
                    node.Is<CompilationUnit>(unit => Root = unit);

                    foreach (var child in node.Children)
                        visitor.VisitChild(child);
                    return this;
                })
                .If<MacroDeclarationStatementNode>((visitor, node) => {
                    var treeSelector = new TreeSelectorCompiler();

                    var scope = _codeInterpreter.InterpreterContext.PushBlock();

                    foreach (var parameter in node.FormalParameters) {
                        var selectors = treeSelector.Parse(parameter.Selector);
                        var value = new List<Node>();

                        foreach (var selector in selectors)
                            value.AddRange(selector.SelectNode(Root));

                        scope.DeclareVariable(parameter.Name, value);
                    }

                    _codeInterpreter.VisitChild(node.Body);

                    _codeInterpreter.InterpreterContext.PopBlock();

                    return this;
                });
        }
    }
}
