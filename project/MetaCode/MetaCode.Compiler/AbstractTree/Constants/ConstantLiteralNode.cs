using System;

namespace MetaCode.Compiler.AbstractTree.Constants
{
    public abstract class ConstantLiteralNode : Node, IConstantLiteralNode
    {
        #region IConstantLiteralNode properties

        public Type Type { get; internal set; }

        #endregion

        #region Constructors
        protected ConstantLiteralNode(Type type)
        {
            Type = type;
        }

        #endregion
    }

    public abstract class ConstantLiteralNode<TValue> : ConstantLiteralNode, IConstantLiteralNode<TValue>
    {
        #region Public properties

        public TValue Value { get; internal set; }

        #endregion

        #region Constructors

        protected ConstantLiteralNode(TValue value, Type type)
            : base(type)
        {
            Value = value;
        }

        #endregion
    }
}