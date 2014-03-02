using System;
using MetaCode.Compiler.AbstractTree.Expressions;

namespace MetaCode.Compiler.AbstractTree.Constants
{
    public interface IConstantLiteralNode : INode
    {
        Type Type { get; }
    }

    public interface IConstantLiteralNode<out TValue> : IConstantLiteralNode
    {
        TValue Value { get; }
    }

    public interface INumberConstantLiteralNode : IConstantLiteralNode<double> { }

    public interface IStringConstantLiteralNode : IConstantLiteralNode<string> { }

    public interface IBooleanConstantLiteralNode : IConstantLiteralNode<bool> { }

    public interface IArrayConstantLiteralNode : IConstantLiteralNode<IExpressionNode[]> { }
}