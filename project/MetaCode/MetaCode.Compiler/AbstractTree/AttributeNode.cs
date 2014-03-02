namespace MetaCode.Compiler.AbstractTree
{
    public class AttributeNode : Node, IAttributeNode
    {
        #region IAttributeNode properties

        public string Name { get; internal set; }

        #endregion
    }
}