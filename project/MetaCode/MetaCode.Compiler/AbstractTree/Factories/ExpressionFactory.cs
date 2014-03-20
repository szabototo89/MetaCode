using System;
using System.Collections.Generic;
using MetaCode.Compiler.AbstractTree.Constants;
using MetaCode.Compiler.AbstractTree.Expressions;
using MetaCode.Compiler.AbstractTree.Operators;
using MetaCode.Compiler.AbstractTree.Operators.Logical;
using MetaCode.Compiler.AbstractTree.Operators.Numerics;
using MetaCode.Compiler.AbstractTree.Operators.Relational;
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
        }


        // TODO: Find identifier by name

        /// <summary>
        /// Find identifier by name
        /// </summary>
        public IdentifierExpressionNode Identifier(string identifier)
        {
            throw new NotImplementedException();
        }
    }
}