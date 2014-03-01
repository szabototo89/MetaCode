using System;
using System.Collections.Generic;

namespace MetaCode.Compiler.AbstractTree
{
    public interface INode
    {
        INode Parent { get; }
        List<INode> Children { get; }
    }
}