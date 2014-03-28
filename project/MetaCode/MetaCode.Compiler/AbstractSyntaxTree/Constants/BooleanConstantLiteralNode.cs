namespace MetaCode.Compiler.AbstractSyntaxTree.Constants
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