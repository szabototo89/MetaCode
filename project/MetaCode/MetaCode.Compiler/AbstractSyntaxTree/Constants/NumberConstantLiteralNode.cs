namespace MetaCode.Compiler.AbstractSyntaxTree.Constants
{
    public class NumberConstantLiteralNode : ConstantLiteralNode<double>
    {
        #region Constructors

        public NumberConstantLiteralNode(double value)
            : base(value)
        {
        }

        #endregion
    }
}