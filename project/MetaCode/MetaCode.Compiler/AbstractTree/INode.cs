using System.Collections.Generic;

namespace MetaCode.Compiler.AbstractTree
{
    public interface INode
    {
        IList<INode> Children { get; }
    }

    public interface IConstantNode<out TValue> : INode
    {
        TValue Value { get; }
    }
}