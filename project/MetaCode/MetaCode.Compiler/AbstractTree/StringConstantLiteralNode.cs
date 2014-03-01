namespace MetaCode.Compiler.AbstractTree
{
    public class StringConstantLiteralNode : ConstantLiteralNode<string>, IStringConstantLiteralNode
    {
        public StringConstantLiteralNode(string value)
            : base(value, typeof(string))
        {
        }
    }
}