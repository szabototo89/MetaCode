using System;
using System.Collections.Generic;

namespace MetaCode.Compiler.AbstractSyntaxTree.Constants
{
    public abstract class ConstantLiteralNode : Node
    {
        public Type Type { get; internal set; }

        public Object Value { get; internal set; }

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

        public new TValue Value
        {
            get { return (TValue)base.Value; }
            internal set { base.Value = value; }
        }

        #endregion

        #region Constructors

        protected ConstantLiteralNode(TValue value)
            : base(typeof(TValue))
        {
            Value = value;
        }

        #endregion
    }
}