namespace MetaCode.Compiler.AbstractTree.Constants
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