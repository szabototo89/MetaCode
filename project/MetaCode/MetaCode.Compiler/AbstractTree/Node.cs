using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Tree;

namespace MetaCode.Compiler.AbstractTree
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

        internal Node AddChildren(params Node[] children)
        {
            if (children == null) 
                throw new ArgumentNullException("children", "The children is null!");

            _children = _children.Union(children).ToList();

            foreach (var child in children)
                child.SetParent(this);

            return this;
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