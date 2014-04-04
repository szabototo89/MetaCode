using System;
using MetaCode.Compiler.AbstractSyntaxTree.Operators;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class BinaryExpressionNode : ExpressionNode
    {
        public BinaryExpressionNode(ExpressionNode left, ExpressionNode right, BinaryOperatorNode operatorNode)
        {
            if (left == null)
                ThrowHelper.ThrowArgumentNullException(() => left);
            if (right == null)
                ThrowHelper.ThrowArgumentNullException(() => right);
            if (operatorNode == null)
                ThrowHelper.ThrowArgumentNullException(() => operatorNode);

            Left = left;
            Right = right;
            Operator = operatorNode;

            AddChildren(Left, Right, Operator);
        }

        public ExpressionNode Left { get; internal set; }

        public ExpressionNode Right { get; internal set; }

        public BinaryOperatorNode Operator { get; internal set; }
    }
}
