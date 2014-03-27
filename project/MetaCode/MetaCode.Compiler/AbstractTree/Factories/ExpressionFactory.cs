using System;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractTree.Constants;
using MetaCode.Compiler.AbstractTree.Expressions;
using MetaCode.Compiler.AbstractTree.Operators;
using MetaCode.Compiler.AbstractTree.Operators.Logical;
using MetaCode.Compiler.AbstractTree.Operators.Numerics;
using MetaCode.Compiler.AbstractTree.Operators.Relational;
using MetaCode.Compiler.AbstractTree.Statements;
using MetaCode.Compiler.Helpers;
using MetaCode.Compiler.Services;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractTree.Factories
{
    public class ExpressionFactory
    {
        public CompilerService CompilerService { get; protected set; }
        private readonly Dictionary<string, OperatorNode> _operators;

        public ExpressionFactory(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            _operators = new Dictionary<string, OperatorNode>()
            {
                {"+", new AdditionOperatorNode()},
                {"-", new SubtractionOperatorNode()},
                {"*", new MultiplicationOperatorNode()},
                {"/", new DivisionOperatorNode()},

                {"<", new LessThanOperatorNode()},
                {">", new GreaterThanOperatorNode()},
                {"<=", new LessThanOrEqualOperatorNode()},
                {">=", new GreaterThanOrEqualOperatorNode()},
                {"==", new EqualityOperatorNode()},
                {"!=", new InequalityOperatorNode()},

                {"not", new NegationOperatorNode()},
            };

            CompilerService = compilerService;
            CompilerService.ExpressionFactory = this;
        }

        public AssignmentExpressionNode Assignment(string identifier, ExpressionNode expression, IEnumerable<AttributeNode> attributes)
        {
            if (string.IsNullOrWhiteSpace(identifier))
                ThrowHelper.ThrowException("The identifier is blank!");

            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);

            var variable = CompilerService.FindVariable(identifier);
            if (variable == null)
                CompilerService.Error(string.Format("Undefined variable: '{0}'", identifier));

            return new AssignmentExpressionNode(variable, expression, attributes);
        }

        public ConstantExpressionNode Constant(ConstantLiteralNode constant)
        {
            if (constant == null)
                ThrowHelper.ThrowArgumentNullException(() => constant);

            return new ConstantExpressionNode(constant, null);
        }

        public BinaryExpressionNode BinaryOperand(ExpressionNode left, ExpressionNode right, string @operator)
        {
            if (left == null)
                ThrowHelper.ThrowArgumentNullException(() => left);
            if (right == null)
                ThrowHelper.ThrowArgumentNullException(() => right);

            OperatorNode operatorNode;

            if (!_operators.TryGetValue(@operator, out operatorNode))
                throw new Exception("Unsupported operator!");

            if (operatorNode is LogicalBinaryOperatorNode)
            {
                if (!left.Type.IsLogical())
                    CompilerService.Error("Left expression must be a boolean expression!");
                if (!right.Type.IsLogical())
                    CompilerService.Error("Right expression must be a boolean expression!");

                return new BinaryExpressionNode(left, right, operatorNode as LogicalBinaryOperatorNode);
            }

            if (operatorNode is NumericBinaryOperatorNode)
            {
                if (!left.Type.IsNumeric())
                    CompilerService.Error("Left expression must be a numeric expression!");
                if (!right.Type.IsNumeric())
                    CompilerService.Error("Right expression must be a numeric expression!");

                return new BinaryExpressionNode(left, right, operatorNode as NumericBinaryOperatorNode);
            }

            if (operatorNode is RelationalBinaryOperatorNode)
            {
                if (!left.Type.IsNumeric())
                    CompilerService.Error("Left expression must be a numeric expression!");
                if (!right.Type.IsNumeric())
                    CompilerService.Error("Right expression must be a numeric expression!");

                return new BinaryExpressionNode(left, right, operatorNode as RelationalBinaryOperatorNode);
            }

            throw new Exception("Invalid operator has found!");
        }


        // TODO: Find identifier by name

        /// <summary>
        /// Find identifier by name
        /// </summary>
        public IdentifierExpressionNode Identifier(string identifier)
        {
            var variable = CompilerService.FindVariable(identifier);
            if (variable == null)
                CompilerService.Error(string.Format("The variable '{0}' does not exists in the scope!", identifier));

            return new IdentifierExpressionNode(new Identifier(variable.Name, variable.Type), null);
        }

        public TypeNameNode Type(string[] identifiers)
        {
            if (identifiers == null)
                ThrowHelper.ThrowArgumentNullException(() => identifiers);

            var typeName = string.Join(".", identifiers);
            Type type = TypeHelper.FindType(typeName);

            if (type == null)
                CompilerService.Error("Type is not found!");

            return new TypeNameNode(type);
        }

        public FunctionExpressionNode Function(string name, Type returnType, FunctionParameterNode[] parameters, Lazy<ExpressionNode> body)
        {
            var statementFactory = CompilerService.StatementFactory;

            return Function(name, returnType, parameters,
                new Lazy<BlockStatementNode>(() =>
                    statementFactory.Block(new Lazy<StatementNodeBase[]>(() => new StatementNodeBase[] { statementFactory.Expression(body.Value) }))));
        }

        public FunctionExpressionNode Function(string name, Type returnType, FunctionParameterNode[] parameters, Lazy<BlockStatementNode> body)
        {
            if (returnType == null)
                ThrowHelper.ThrowArgumentNullException(() => returnType);
            if (body == null)
                ThrowHelper.ThrowArgumentNullException(() => body);
            if (parameters == null)
                ThrowHelper.ThrowArgumentNullException(() => parameters);

            var scope = CompilerService.GetScope();

            if (!string.IsNullOrWhiteSpace(name))
            {
                if (CompilerService.FindFunction(name) != null)
                    CompilerService.Error(string.Format("The '{0}' is already defined!", name));

                scope.DeclareFunction(name, returnType, parameters.Select(param => param.TypeName.Type).ToArray());
            }            
            var functionScope = CompilerService.PushScope();

            foreach (var parameter in parameters)
                functionScope.DeclareVariable(parameter.Name, parameter.TypeName.Type);

            var bodyStatement = body.Value;
            CompilerService.PopScope();

            return new FunctionExpressionNode(name, bodyStatement, new TypeNameNode(returnType), null);
        }

        public FunctionParameterNode FunctionFormalParameter(string name, TypeNameNode type, IEnumerable<AttributeNode> attributes)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The name is blank!");
            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            return new FunctionParameterNode(name, type, attributes);
        }

        public MemberExpressionNode Member(IEnumerable<ExpressionNode> members)
        {
            if (members == null)
                ThrowHelper.ThrowArgumentNullException(() => members);
            return new MemberExpressionNode(members.ToArray());
        }
    }
}