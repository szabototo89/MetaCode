using System;
using System.Collections.Generic;
using System.Security.Principal;

namespace MetaCode.Compiler.AbstractTree
{
    public interface INode
    {
        INode Parent { get; }
        List<INode> Children { get; }
    }
}