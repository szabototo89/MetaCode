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