using MetaCode.Core;
using System;
using System.Collections.Generic;
using System.Linq;

namespace MetaCode.Compiler.AbstractSyntaxTree
{
    public abstract class Node
    {
        #region Private fields

        protected List<Node> _children;

        #endregion

        #region Constructors

        protected Node()
        {
            _children = new List<Node>();
        }

        #endregion

        #region Internal methods

        internal Node AddChildren<TNode>(IEnumerable<TNode> children)
            where TNode : Node
        {
            if (children == null)
                ThrowHelper.ThrowArgumentNullException(() => children);

            _children = _children.Union(children).ToList();

            foreach (var child in children)
                child.SetParent(this);

            return this;
        }

        internal Node AddChildren(params Node[] children)
        {
            return AddChildren<Node>(children);
        }

        internal void SetParent(Node parent)
        {
            Parent = parent;
        }

        #endregion

        #region Public properties

        public Node Parent { get; private set; }

        public virtual IEnumerable<Node> Children { get { return _children; } }

        #endregion

    }
}