using System;
using System.Collections.Generic;
using System.Linq.Expressions;

namespace MetaCode.Compiler.AbstractTree
{
    public interface IExpressionNode : INode
    {
        Type Type { get; }

        IEnumerable<IAttributeNode> Attributes { get; }
    }

    public interface IConstantExpressionNode : IExpressionNode
    {
        IConstantLiteralNode Constant { get; }
    }
}