using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public abstract class TypeDeclarationStatementNodeBase : DeclarationStatementNodeBase, ISupportAttributes
    {
        public List<FormalParameterNode> Parameters { get; protected set; }

        public List<AttributeNode> Attributes { get; protected set; }

        protected TypeDeclarationStatementNodeBase(string name, FormalParameterNode[] parameters, AttributeNode[] attributes)
            : base(name)
        {
            if (parameters == null)
                ThrowHelper.ThrowArgumentNullException(() => parameters);

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            Parameters = parameters.ToList();
            Attributes = attributes.ToList();

            AddChildren(Parameters);
            AddChildren(Attributes);
        }
    }
}