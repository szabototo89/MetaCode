using System.Collections.Generic;
using System.Linq;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public abstract class PrimaryExpressionNode : ExpressionNode
    {
        protected PrimaryExpressionNode(IEnumerable<AttributeNode> attributes)
        {
            Attributes = (attributes ?? new List<AttributeNode>()).ToList();
            AddChildren(Attributes.OfType<Node>().ToArray());
        }

        public IEnumerable<AttributeNode> Attributes { get; internal set; }
    }
}
