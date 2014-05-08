using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class FunctionDeclarationStatementNode : DeclarationStatementNodeBase, ISupportAttributes
    {
        public string FunctionName { get { return Identifier.Name; } }

        public BlockStatementNode FunctionBody { get; protected set; }

        public TypeNameNode ReturnType { get; protected set; }

        public IEnumerable<FormalParameterNode> Parameters { get; protected set; }

        public List<AttributeNode> Attributes { get; protected set; }

        public FunctionDeclarationStatementNode(string name, BlockStatementNode functionBody, TypeNameNode returnType, FormalParameterNode[] parameters, IEnumerable<AttributeNode> attributes)
            : base(name)
        {
            if (functionBody == null)
                ThrowHelper.ThrowArgumentNullException(() => functionBody);
            if (returnType == null)
                ThrowHelper.ThrowArgumentNullException(() => returnType);
            if (parameters == null)
                ThrowHelper.ThrowArgumentNullException(() => parameters);
            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            FunctionBody = functionBody;
            ReturnType = returnType;
            Parameters = parameters;
            Attributes = attributes.ToList();

            AddChildren(FunctionBody, ReturnType);
            AddChildren(Parameters);
            AddChildren(Attributes);
        }
    }
}
