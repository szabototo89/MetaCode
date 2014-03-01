namespace MetaCode.Compiler.AbstractTree
{
    public class BooleanConstantLiteralNode : ConstantLiteralNode<bool>, IBooleanConstantLiteralNode
    {
        #region Constructors

        public BooleanConstantLiteralNode(bool value)
            : base(value, typeof(bool))
        {
        }

        #endregion
    }
}