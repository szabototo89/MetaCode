namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class AttributeDeclarationStatementNode : TypeDeclarationStatementNodeBase
    {
        public string AttributeName { get { return Identifier.Name; } }

        public AttributeDeclarationStatementNode(string name, FormalParameterNode[] parameters, AttributeNode[] attributes)
            : base(name, parameters, attributes)
        {

        }
    }
}