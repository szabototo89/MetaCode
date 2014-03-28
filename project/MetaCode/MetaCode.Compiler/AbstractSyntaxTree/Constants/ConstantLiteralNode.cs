using System;

namespace MetaCode.Compiler.AbstractSyntaxTree.Constants
{
    public abstract class ConstantLiteralNode : Node
    {
        public Type Type { get; internal set; }

        #region Constructors
        protected ConstantLiteralNode(Type type)
        {
            Type = type;
        }

        #endregion
    }

    public abstract class ConstantLiteralNode<TValue> : ConstantLiteralNode
    {
        #region Public properties

        public TValue Value { get; internal set; }

        #endregion

        #region Constructors

        protected ConstantLiteralNode(TValue value, Type type)
            : base(typeof(TValue))
        {
            Value = value;
        }

        #endregion
    }
}