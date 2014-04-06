using MetaCode.Core;
using System;
using System.Collections.Generic;
using System.Linq;

namespace MetaCode.Compiler.AbstractSyntaxTree
{
    public class FormalParameterNode : Node, ISupportAttributes
    {
        public List<AttributeNode> Attributes { get; protected set; }

        public string Name { get; internal set; }

        public TypeNameNode TypeName { get; internal set; }

        public FormalParameterNode(string name, TypeNameNode typeName)
            : this(name, typeName, new AttributeNode[0])
        {
        }

        public FormalParameterNode(string name, TypeNameNode typeName, IEnumerable<AttributeNode> attributes)
        {
            if (name == null) throw new ArgumentNullException("name", "The name is ");
            if (typeName == null) throw new ArgumentNullException("typeName");

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            Name = name;
            TypeName = typeName;
            Attributes = attributes.ToList();
        }
    }
}
