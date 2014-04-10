namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class ObjectDeclarationStatementNode : TypeDeclarationStatementNodeBase
    {
        public string ObjectName { get { return Identifier.Name; } }

        public ObjectDeclarationStatementNode(string name, FormalParameterNode[] parameters, AttributeNode[] attributes)
            : base(name, parameters, attributes)
        {
        }
    }
}