using System.Collections.Generic;

namespace MetaCode.Compiler.AbstractTree
{
    public class NumberConstantLiteralNode : ConstantLiteralNode<double>, INumberConstantLiteralNode
    {
        #region Constructors

        public NumberConstantLiteralNode(double value)
            : base(value, typeof(double))
        {
        }

        #endregion
    }
}