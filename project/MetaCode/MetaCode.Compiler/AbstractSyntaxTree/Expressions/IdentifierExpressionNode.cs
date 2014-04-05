using System;
using System.Collections.Generic;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class IdentifierExpressionNode : PrimaryExpressionNode
    {
        public string Name { get; protected set; }

        public IdentifierExpressionNode(string name)
            : this(name, null)
        {
        }

        public IdentifierExpressionNode(string name, IEnumerable<AttributeNode> attributes)
            : base(attributes)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");
            Name = name;
        }
    }
}
