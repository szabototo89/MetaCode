using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
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

        private readonly InterpreterContext _interpreterContext;
        private readonly Stack<object> _expressionStack;

        private bool _isInInterpreterMode;

        private CompilationUnit _root;

        public MacroInterpreter(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            _isInInterpreterMode = false;

            CompilerService = compilerService;
            _expressionStack = new Stack<object>();
            _interpreterContext = new InterpreterContext(compilerService);

            Initialize();
            InitializeNativeFunctions();
        }

        private void InitializeNativeFunctions()
        {
            _interpreterContext.DeclareNativeFunction("toSyntaxTree", new Func<object, object>(value => {
                var compiler = new MetaCodeCompiler();
                return compiler.ParseWithVisitor<Node, AbstractTreeVisitor>(value.ToString(), () => new AbstractTreeVisitor(CompilerService.Instance));
            }));

            _interpreterContext.DeclareNativeFunction("find", new Func<object, object, object>((tree, filter) => {
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

            _interpreterContext.DeclareNativeMacroFunction("replace", args => {
                return args.First();
            });
        }

        private void Initialize()
        {
            this.
                DefaultVisitor((visitor, node) => {
                    node.Is<CompilationUnit>(unit => _root = unit);

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
                            value.AddRange(selector.SelectNode(_root));

                        _interpreterContext.DeclareVariable(parameter.Name, value);
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

                    _interpreterContext.SetValueOfVariable(variable, _expressionStack.Pop());

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
                    var value = _interpreterContext.GetValueOfVariable(name);
                    _expressionStack.Push(value);

                    return this;
                })
                .If<VariableDeclarationStatementNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    var name = node.VariableName;
                    visitor.VisitChild(node.InitialValue);
                    var value = _expressionStack.Pop();

                    _interpreterContext.DeclareVariable(name, value);

                    return this;
                })
                .If<ForeachLoopStatementNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    var variable = node.LoopVariable.Name;

                    _interpreterContext.PushBlock();
                    _interpreterContext.DeclareVariable(variable, null);

                    visitor.VisitChild(node.Expression);
                    var array = _expressionStack.Pop() as IEnumerable;

                    foreach (var value in array) {
                        _interpreterContext.SetValueOfVariable(variable, value);
                        visitor.VisitChild(node.Body);
                    }

                    _interpreterContext.PopBlock();

                    return this;
                })
                .If<MacroCallExpressionNode>((visitor, node) => {
                    if (!_isInInterpreterMode)
                        return this;

                    var name = node.FunctionName.Name;
                    var result = _interpreterContext.InvokeMacroFunction(name, node.ActualParameters);
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

                    var result = _interpreterContext.InvokeFunction(name, parameters.ToArray().Reverse());
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

                    _interpreterContext.PushBlock();

                    foreach (var child in node.Children)
                        visitor.VisitChild(child);

                    _interpreterContext.PopBlock();

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
                });
        }
    }
}
