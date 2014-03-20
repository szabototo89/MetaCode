using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractTree.Operators;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractTree.Expressions
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

        public override Type Type
        {
            get { return Operator.Type; }
        }
    }
}
