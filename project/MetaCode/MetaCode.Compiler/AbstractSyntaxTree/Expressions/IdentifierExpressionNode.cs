using System;
using System.Collections.Generic;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class IdentifierExpressionNode : PrimaryExpressionNode
    {
        public Identifier Identifier { get; internal set; }

        public IdentifierExpressionNode(Identifier identifier, IEnumerable<AttributeNode> attributes)
            : base(attributes)
        {
            if (identifier == null)
                ThrowHelper.ThrowArgumentNullException(() => identifier);

            Identifier = identifier;
            AddChildren(Identifier);
        }

        public string Name
        {
            get { return Identifier.Name; }
        }

        public override Type Type
        {
            get { return Identifier.Type; }
        }
    }
}
