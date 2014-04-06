using System.Collections.Generic;
using System.Linq;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public abstract class PrimaryExpressionNode : ExpressionNode, ISupportAttributes
    {
        protected PrimaryExpressionNode(IEnumerable<AttributeNode> attributes)
        {
            Attributes = (attributes ?? new List<AttributeNode>()).ToList();
            AddChildren(Attributes);
        }

        public List<AttributeNode> Attributes { get; protected set; }
    }
}
