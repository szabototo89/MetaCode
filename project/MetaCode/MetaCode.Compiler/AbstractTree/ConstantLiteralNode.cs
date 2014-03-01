using System;

namespace MetaCode.Compiler.AbstractTree
{
    public abstract class ConstantLiteralNode<TValue> : Node, IConstantLiteralNode<TValue>
    {
        #region Public properties

        public Type Type { get; internal set; }
        public TValue Value { get; internal set; }

        #endregion

        #region Constructors

        protected ConstantLiteralNode(TValue value, Type type)
        {
            Value = value;
            Type = type;
        }

        #endregion
    }
}