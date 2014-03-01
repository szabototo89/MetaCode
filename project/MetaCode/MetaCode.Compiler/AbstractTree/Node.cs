using System.Collections.Generic;

namespace MetaCode.Compiler.AbstractTree
{
    public abstract class Node : INode
    {
        protected Node()
        {
            Children = new List<INode>();
        }

        public INode Parent { get; protected set; }

        public List<INode> Children { get; protected set; }
    }
}