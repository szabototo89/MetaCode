namespace MetaCode.Compiler.AbstractTree.Constants
{
    public class BooleanConstantLiteralNode : ConstantLiteralNode<bool>
    {
        #region Constructors

        public BooleanConstantLiteralNode(bool value)
            : base(value, typeof(bool))
        {
        }

        #endregion
    }
}