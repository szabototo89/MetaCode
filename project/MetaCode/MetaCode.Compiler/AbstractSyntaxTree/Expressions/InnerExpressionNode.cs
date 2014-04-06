using System.Linq.Expressions;
using MetaCode.Core;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class InnerExpressionNode : ExpressionNode, ISupportAttributes
    {
        public ExpressionNode Expression { get; set; }
        public List<AttributeNode> Attributes { get; protected set; }

        public InnerExpressionNode(ExpressionNode expression)
            : this(expression, new AttributeNode[0])
        {
        }

        public InnerExpressionNode(ExpressionNode expression, IEnumerable<AttributeNode> attributes)
        {
            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            Expression = expression;
            Attributes = attributes.ToList();

            AddChildren(Expression);
            AddChildren(Attributes);
        }
    }
}
