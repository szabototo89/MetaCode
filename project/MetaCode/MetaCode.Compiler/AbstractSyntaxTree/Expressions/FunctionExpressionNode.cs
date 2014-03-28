using System;
using System.Collections.Generic;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class FunctionExpressionNode : PrimaryExpressionNode
    {
        public string Name { get; protected set; }

        public BlockStatementNode FunctionBlock { get; protected set; }

        public TypeNameNode ReturnType { get; protected set; }

        public bool IsAnonymFunction { get { return string.IsNullOrWhiteSpace(Name); } }

        public FunctionExpressionNode(string name, BlockStatementNode functionBlock, TypeNameNode returnType, IEnumerable<AttributeNode> attributes)
            : base(attributes)
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

        public override Type Type
        {
            get { return typeof(Delegate); }
        }
    }
}
