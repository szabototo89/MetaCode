using System.Collections.Generic;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class FunctionDeclarationStatementNode : StatementNodeBase
    {
        public string Name { get; protected set; }

        public BlockStatementNode FunctionBlock { get; protected set; }

        public TypeNameNode ReturnType { get; protected set; }

        public bool IsAnonymFunction { get { return string.IsNullOrWhiteSpace(Name); } }

        public FunctionDeclarationStatementNode(string name, BlockStatementNode functionBlock, TypeNameNode returnType, IEnumerable<AttributeNode> attributes)
        {
            if (functionBlock == null)
                ThrowHelper.ThrowArgumentNullException(() => functionBlock);
            if (returnType == null)
                ThrowHelper.ThrowArgumentNullException(() => returnType);

            Name = name;
            FunctionBlock = functionBlock;
            ReturnType = returnType;

            AddChildren(FunctionBlock, ReturnType);
        }
    }
}
