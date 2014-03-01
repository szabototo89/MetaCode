namespace MetaCode.Compiler.AbstractTree
{
    public class StringConstantLiteralNode : ConstantLiteralNode<string>, IStringConstantLiteralNode
    {
        #region Constructors

        public StringConstantLiteralNode(string value)
            : base(value, typeof(string))
        {
        }

        #endregion
    }
}