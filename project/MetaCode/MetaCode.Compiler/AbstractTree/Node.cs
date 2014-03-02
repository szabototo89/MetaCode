using System.Collections.Generic;
using System.Linq;

namespace MetaCode.Compiler.AbstractTree
{
    public abstract class Node : INode
    {
        #region Constructors

        protected Node()
        {
            Children = new List<Node>();
        }

        #endregion

        #region Internal methods

        internal void SetParent(Node parent)
        {
            Parent = parent;
        }

        #endregion

        #region INode properties

        INode INode.Parent
        {
            get { return Parent; }
        }

        List<INode> INode.Children
        {
            get { return Children.OfType<INode>().ToList(); }
        }

        public Node Parent { get; internal set; }

        public List<Node> Children { get; internal set; }

        #endregion

    }
}