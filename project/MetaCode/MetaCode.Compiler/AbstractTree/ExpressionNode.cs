using System;
using System.Collections.Generic;
using System.Linq;

namespace MetaCode.Compiler.AbstractTree
{
    public abstract class ExpressionNode : Node, IExpressionNode
    {
        private List<IAttributeNode> _attributes;
        public abstract Type Type { get; }

        public IEnumerable<IAttributeNode> Attributes
        {
            get { return _attributes; }
            internal set { _attributes = value.ToList(); }
        }

        protected ExpressionNode(IEnumerable<IAttributeNode> attributes)
        {
            Attributes = (attributes ?? new List<IAttributeNode>()).ToList();
            Children.AddRange(Attributes);
        }
    }
}