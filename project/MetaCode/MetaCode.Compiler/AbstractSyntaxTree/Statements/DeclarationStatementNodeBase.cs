using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public abstract class DeclarationStatementNodeBase : StatementNodeBase
    {
        public IdentifierNode Identifier { get; protected set; }

        protected DeclarationStatementNodeBase(string identifier)
        {
            if (identifier == null)
                ThrowHelper.ThrowArgumentNullException(() => identifier);

            Identifier = new IdentifierNode(identifier);
            AddChildren(Identifier);
        }
    }
}