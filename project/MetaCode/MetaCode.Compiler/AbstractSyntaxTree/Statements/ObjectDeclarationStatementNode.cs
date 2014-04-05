namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class ObjectDeclarationStatementNode : TypeDeclarationStatementNodeBase
    {
        public ObjectDeclarationStatementNode(string name, FormalParameterNode[] parameters, AttributeNode[] attributes)
            : base(name, parameters, attributes)
        {
        }
    }
}