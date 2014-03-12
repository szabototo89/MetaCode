namespace MetaCode.Compiler.AbstractTree.Constants
{
    public class StringConstantLiteralNode : ConstantLiteralNode<string>
    {
        #region Constructors

        public StringConstantLiteralNode(string value)
            : base(value, typeof(string))
        {
        }

        #endregion
    }
}