using System;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree
{
    public class TypeNameNode : Node, ISupportAttributes
    {
        public string Type { get; set; }
        public List<AttributeNode> Attributes { get; protected set; }

        public TypeNameNode(string type)
            : this(type, new AttributeNode[0])
        {
        }

        public TypeNameNode(string type, AttributeNode[] attributes)
        {
            if (string.IsNullOrWhiteSpace(type))
                ThrowHelper.ThrowException("The 'type' is blank!");

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            Type = type;
            Attributes = attributes.ToList();

            AddChildren(Attributes);
        }
    }
}
