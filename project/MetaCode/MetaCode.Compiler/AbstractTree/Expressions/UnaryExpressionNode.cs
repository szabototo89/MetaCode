﻿using MetaCode.Compiler.AbstractTree.Operators;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractTree.Expressions
{
    public abstract class UnaryExpressionNode : ExpressionNode
    {
        protected UnaryExpressionNode(UnaryOperatorNode @operator, ExpressionNode expression)
        {
            if (@operator == null)
                ThrowHelper.ThrowArgumentNullException(() => @operator);

            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);

            Operator = @operator;
            Expression = expression;

            AddChildren(Operator, Expression);
        }

        public UnaryOperatorNode Operator { get; internal set; }

        public ExpressionNode Expression { get; internal set; }
    }
}