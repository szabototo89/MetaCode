using System;
using System.Collections.Generic;

namespace MetaCode.Compiler.AbstractTree
{
    public interface IExpressionNode : INode
    {
        Type Type { get; }

        List<IAttributeNode> Attributes { get; }
    }
}