using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public abstract class TypeDeclarationStatementNodeBase : StatementNodeBase
    {
        public IdentifierExpressionNode Identifier { get; protected set; }

        public List<FormalParameterNode> Parameters { get; protected set; }

        public List<AttributeNode> Attributes { get; protected set; }

        protected TypeDeclarationStatementNodeBase(string name, FormalParameterNode[] parameters, AttributeNode[] attributes)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (parameters == null)
                ThrowHelper.ThrowArgumentNullException(() => parameters);

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            Identifier = new IdentifierExpressionNode(name, null);
            Parameters = parameters.ToList();
            Attributes = attributes.ToList();

            AddChildren(Identifier);
            AddChildren(Parameters);
            AddChildren(Attributes);
        }
    }
}