using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Expressions
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
