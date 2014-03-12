using System;
using System.Collections.Generic;
using System.Linq;

namespace MetaCode.Compiler.AbstractTree.Expressions
{
    public abstract class ExpressionNode : Node
    {
        #region Private fields

        private List<AttributeNode> _attributes;

        #endregion

        #region Public properties

        public abstract Type Type { get; }

        public IEnumerable<AttributeNode> Attributes
        {
            get { return _attributes; }
            protected set { _attributes = value.ToList(); }
        }

        #endregion

        #region Constructors

        protected ExpressionNode(IEnumerable<AttributeNode> attributes)
        {
            Attributes = (attributes ?? new List<AttributeNode>()).ToList();
            _children.AddRange(Attributes);
        }

        #endregion
    }
}