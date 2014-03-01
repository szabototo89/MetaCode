using System;
using System.Runtime.InteropServices;

namespace MetaCode.Compiler.AbstractTree
{
    public interface IConstantLiteralNode<out TValue> : INode
    {
        Type Type { get; }

        TValue Value { get; }
    }

    public interface INumberConstantLiteralNode : IConstantLiteralNode<double> { }

    public interface IStringConstantLiteralNode : IConstantLiteralNode<string> { }

    public interface IBooleanConstantLiteralNode : IConstantLiteralNode<bool> { }

    public interface IArrayConstantLiteralNode : IConstantLiteralNode<IExpressionNode[]> { }
}