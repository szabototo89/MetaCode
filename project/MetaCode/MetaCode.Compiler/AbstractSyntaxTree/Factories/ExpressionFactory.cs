using System;
using System.Collections.Generic;
using System.Linq;
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
            return new IdentifierExpressionNode(identifier, null);
        }

        public TypeNameNode Type(string typeName)
        {
            if (string.IsNullOrWhiteSpace(typeName))
                ThrowHelper.ThrowException("The 'typeName' is blank!");

            return new TypeNameNode(typeName);
        }

        public MemberExpressionNode Member(IEnumerable<ExpressionNode> members)
        {
            if (members == null)
                ThrowHelper.ThrowArgumentNullException(() => members);
            return new MemberExpressionNode(members.ToArray());
        }
    }
}