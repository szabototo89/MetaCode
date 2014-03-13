using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Tree;

namespace MetaCode.Compiler.AbstractTree
{
    public abstract class Node
    {
        #region Private fields

        protected readonly List<Node> _children;

        #endregion

        #region Constructors

        protected Node()
        {
            _children = new List<Node>();
        }

        #endregion

        #region Internal methods

        internal Node SetParentOfNodes(params Node[] nodes)
        {
            if (nodes == null) 
                throw new ArgumentNullException("nodes", "The nodes is null!");

            foreach (var node in nodes)
                node.SetParent(this);

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