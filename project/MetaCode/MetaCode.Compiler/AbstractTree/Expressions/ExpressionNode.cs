using System;
using System.Collections.Generic;
using System.Linq;

namespace MetaCode.Compiler.AbstractTree.Expressions
{
    public abstract class ExpressionNode : Node, IExpressionNode
    {
        #region Private fields

        private List<AttributeNode> _attributes;

        #endregion

        #region Explicit implementations of IExpressionNode

        IEnumerable<IAttributeNode> IExpressionNode.Attributes
        {
            get { return Attributes; }
        }

        #endregion

        #region Public IExpressionNode properties

        public abstract Type Type { get; }

        public IEnumerable<AttributeNode> Attributes
        {
            get { return _attributes; }
            internal set { _attributes = value.ToList(); }
        }

        #endregion

        #region Constructors

        protected ExpressionNode(IEnumerable<AttributeNode> attributes)
        {
            Attributes = (attributes ?? new List<AttributeNode>()).ToList();
            Children.AddRange(Attributes);
        }

        #endregion
    }
}