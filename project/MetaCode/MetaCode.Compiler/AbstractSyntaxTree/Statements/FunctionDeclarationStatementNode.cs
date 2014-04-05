using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class FunctionDeclarationStatementNode : StatementNodeBase
    {
        public IdentifierExpressionNode Identifier { get; protected set; }

        public BlockStatementNode FunctionBlock { get; protected set; }

        public TypeNameNode ReturnType { get; protected set; }

        public IEnumerable<FormalParameterNode> Parameters { get; protected set; }
        public List<AttributeNode> Attributes { get; protected set; }

        public FunctionDeclarationStatementNode(string name, BlockStatementNode functionBlock, TypeNameNode returnType, FormalParameterNode[] parameters, IEnumerable<AttributeNode> attributes)
        {
            if (functionBlock == null)
                ThrowHelper.ThrowArgumentNullException(() => functionBlock);
            if (returnType == null)
                ThrowHelper.ThrowArgumentNullException(() => returnType);
            if (parameters == null)
                ThrowHelper.ThrowArgumentNullException(() => parameters);
            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            Identifier = new IdentifierExpressionNode(name, null);
            FunctionBlock = functionBlock;
            ReturnType = returnType;
            Parameters = parameters;
            Attributes = attributes.ToList();

            AddChildren(FunctionBlock, ReturnType);
            AddChildren(Parameters);
            AddChildren(Attributes);
        }
    }
}
