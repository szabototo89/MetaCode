using System.Collections.Generic;

namespace MetaCode.Compiler.AbstractTree
{
    public abstract class Node : INode
    {
        protected Node()
        {
            Children = new List<INode>();
        }

        internal void SetParent(INode parent)
        {
            Parent = parent;
        }

        public INode Parent { get; internal set; }

        public List<INode> Children { get; protected set; }
    }
}