using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree.Constants;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Logical;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Numerics;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Relational;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.Helpers;
using MetaCode.Compiler.Interpreter;
using MetaCode.Compiler.Services;
using MetaCode.Compiler.Visitors;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Visitors
{
    public class CodeInterpreter : TreeVisitorBase<CodeInterpreter>
    {
        public CompilerService CompilerService { get; set; }

        public InterpreterContext InterpreterContext { get; protected set; }
        private readonly Stack<object> _expressionStack;

        private CompilationUnit _root;

        public CodeInterpreter(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            CompilerService = compilerService;
            _expressionStack = new Stack<object>();
            InterpreterContext = new InterpreterContext(compilerService);

            Initialize();
            InitializeNativeFunctions();
        }

        private void InitializeNativeFunctions()
        {
            InterpreterContext.DeclareNativeFunction("toString", new Func<object, string>(value => value.ToString()));
            InterpreterContext.DeclareNativeFunction("toString", new Func<object, string>(value => value.ToString()));
            InterpreterContext.DeclareNativeFunction("new", new Func<object, object>(value => new ObjectType() { Type = value.ToString() }));
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
                .If<MacroDeclarationStatementNode>((visitor, node) => this)
                .If<FunctionDeclarationStatementNode>((visitor, node) => {
                    InterpreterContext.DeclareFunction(node.FunctionName, node, this);
                    return this;
                })
                .If<ObjectDeclarationStatementNode>((visitor, node) =>
                {
                    InterpreterContext.DeclareVariable(node.ObjectName, node.ObjectName);
                    return this;
                })
                .If<UnaryExpressionNode>((visitor, node) => {
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
                    visitor.VisitChild(node.RightValue);
                    var variable = node.LeftValue.Members.First().Name;

                    if (node.LeftValue.Members.Length == 1) {
                        InterpreterContext.SetValueOfVariable(variable, _expressionStack.Pop());
                    }
                    else {
                        var members = string.Join(".",
                            node.LeftValue.Members.Skip(1)
                                .Select(member => member.Name));
                        var value =
                            InterpreterContext.GetValueOfVariable(
                                variable);
                        if (!(value is Dictionary<string, object>))
                            value = new Dictionary<string, object>();
                        value.As<Dictionary<string, object>>()[members] = _expressionStack.Pop();
                        InterpreterContext.SetValueOfVariable(variable, value);
                    }

                    return this;
                })
                .If<ArrayConstantLiteralNode>((visitor, node) => {
                    foreach (var value in node.Value)
                        visitor.VisitChild(value);

                    var values = new object[node.Value.Length];

                    for (int i = 0; i < node.Value.Length; i++)
                        values[node.Value.Length - 1 - i] = _expressionStack.Pop();

                    _expressionStack.Push(values.ToArray());

                    return this;
                })
                .If<ConstantExpressionNode>((visitor, node) => {
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
                    var name = node.Name;
                    var value = InterpreterContext.GetValueOfVariable(name);
                    _expressionStack.Push(value);

                    return this;
                })
                .If<VariableDeclarationStatementNode>((visitor, node) => {
                    var name = node.VariableName;
                    visitor.VisitChild(node.InitialValue);
                    var value = _expressionStack.Pop();

                    InterpreterContext.DeclareVariable(name, value);

                    return this;
                })
                .If<AttributeDeclarationStatementNode>((visitor, node) => {
                    var name = node.AttributeName;

                    //InterpreterContext.DeclareAttribute(name, node);

                    return this;
                })
                .If<ForeachLoopStatementNode>((visitor, node) => {
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
                .If<MemberExpressionNode>((visitor, node) => {
                    var variable = InterpreterContext.GetValueOfVariable(node.Members.First().Name).As<Dictionary<string, object>>();
                    if (variable == null)
                        ThrowHelper.ThrowException("Wrong type of " + node.Members.First().Name);

                    var members = string.Join(".", node.Members.Skip(1).Select(member => member.Name));
                    _expressionStack.Push(variable[members]);

                    return this;
                })
                .If<MacroCallExpressionNode>((visitor, node) => {
                    var name = node.FunctionName.Name;
                    var result = InterpreterContext.InvokeMacroFunction(name, node.ActualParameters);
                    _expressionStack.Push(result);

                    return this;
                })
                .If<ReturnStatementNode>((visitor, node) => {
                    return this;
                })
                .If<FunctionCallExpressionNode>((visitor, node) => {
                    var name = node.FunctionName.Name;
                    foreach (var param in node.ActualParameters)
                        visitor.VisitChild(param);

                    var parameters = new List<object>();

                    for (int i = 0; i < node.ActualParameters.Count(); i++)
                        parameters.Add(_expressionStack.Pop());

                    var result = InterpreterContext.InvokeFunction(name, parameters.ToArray().Reverse());

                    if (result != TypeHelper.Void)
                        _expressionStack.Push(result);

                    return this;
                })
                .If<WhileLoopStatementNode>((visitor, node) => {
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
                    InterpreterContext.PushBlock();

                    foreach (var child in node.Children)
                        visitor.VisitChild(child);

                    InterpreterContext.PopBlock();

                    return this;
                })
                .If<IfStatementNode>((visitor, node) => {
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
