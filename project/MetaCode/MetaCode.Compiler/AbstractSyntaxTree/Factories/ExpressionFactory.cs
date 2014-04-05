using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using Antlr4.Runtime.Tree;
using MetaCode.Compiler.AbstractSyntaxTree.Constants;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Operators;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Logical;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Numerics;
using MetaCode.Compiler.AbstractSyntaxTree.Operators.Relational;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.Helpers;
using MetaCode.Compiler.Services;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Factories
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

        public AssignmentExpressionNode Assignment(MemberExpressionNode leftValue, ExpressionNode rightValue)
        {
            return Assignment(leftValue, rightValue, new AttributeNode[0]);
        }

        public AssignmentExpressionNode Assignment(MemberExpressionNode leftValue, ExpressionNode rightValue, IEnumerable<AttributeNode> attributes)
        {
            if (leftValue == null)
                ThrowHelper.ThrowArgumentNullException(() => leftValue);

            if (rightValue == null)
                ThrowHelper.ThrowArgumentNullException(() => rightValue);

            return new AssignmentExpressionNode(leftValue, rightValue, attributes);
        }

        public ConstantExpressionNode Constant(ConstantLiteralNode constant)
        {
            return Constant(constant, new AttributeNode[0]);
        }

        public ConstantExpressionNode Constant(ConstantLiteralNode constant, IEnumerable<AttributeNode> attributes)
        {
            if (constant == null)
                ThrowHelper.ThrowArgumentNullException(() => constant);

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            return new ConstantExpressionNode(constant, attributes);
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

            if (operatorNode is LogicalBinaryOperatorNode) {
                return new BinaryExpressionNode(left, right, operatorNode as LogicalBinaryOperatorNode);
            }

            if (operatorNode is NumericBinaryOperatorNode) {
                return new BinaryExpressionNode(left, right, operatorNode as NumericBinaryOperatorNode);
            }

            if (operatorNode is RelationalBinaryOperatorNode) {
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
            return Identifier(identifier, new AttributeNode[0]);
        }

        /// <summary>
        /// Find identifier by name
        /// </summary>
        public IdentifierExpressionNode Identifier(string identifier, IEnumerable<AttributeNode> attributes)
        {
            if (string.IsNullOrWhiteSpace(identifier))
                ThrowHelper.ThrowException("The 'identifier' is blank!");

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            return new IdentifierExpressionNode(identifier, attributes);
        }

        public TypeNameNode Type(string typeName)
        {
            return Type(typeName, new AttributeNode[0]);
        }

        public TypeNameNode Type(string typeName, AttributeNode[] attributes)
        {
            if (string.IsNullOrWhiteSpace(typeName))
                ThrowHelper.ThrowException("The 'typeName' is blank!");

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            return new TypeNameNode(typeName, attributes);
        }

        public MemberExpressionNode Member(string[] members)
        {
            if (members == null)
                ThrowHelper.ThrowArgumentNullException(() => members);

            var identifiers = members.Select(member => new IdentifierExpressionNode(member, null))
                                     .ToArray();

            return new MemberExpressionNode(identifiers);
        }

        public ExpressionNode InnerExpression(ExpressionNode expression)
        {
            return InnerExpression(expression, new AttributeNode[0]);
        }

        public InnerExpressionNode InnerExpression(ExpressionNode expression, IEnumerable<AttributeNode> attributes)
        {
            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            return new InnerExpressionNode(expression, attributes);
        }

        public FunctionCallExpressionNode FunctionCall(string name)
        {
            return FunctionCall(name, new ExpressionNode[0]);
        }

        public FunctionCallExpressionNode FunctionCall(string name, ExpressionNode[] actualParameters)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (actualParameters == null)
                ThrowHelper.ThrowArgumentNullException(() => actualParameters);

            return new FunctionCallExpressionNode(name, actualParameters);
        }

        public MacroCallExpressionNode MacroCall(string name)
        {
            return MacroCall(name, new StatementNodeBase[0]);
        }

        public MacroCallExpressionNode MacroCall(string name, StatementNodeBase[] actualParameters)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (actualParameters == null)
                ThrowHelper.ThrowArgumentNullException(() => actualParameters);

            return new MacroCallExpressionNode(name, actualParameters);
        }
    }
}