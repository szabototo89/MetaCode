using MetaCode.Compiler.AbstractSyntaxTree.Operators;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class UnaryExpressionNode : ExpressionNode
    {
        public UnaryExpressionNode(UnaryOperatorNode @operator, ExpressionNode expression)
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