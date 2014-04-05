namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class AttributeDeclarationStatementNode : TypeDeclarationStatementNodeBase
    {
        public AttributeDeclarationStatementNode(string name, FormalParameterNode[] parameters, AttributeNode[] attributes)
            : base(name, parameters, attributes)
        {
        }
    }
}