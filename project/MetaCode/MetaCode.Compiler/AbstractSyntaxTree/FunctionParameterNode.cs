using System;
using System.Collections.Generic;
using System.Linq;

namespace MetaCode.Compiler.AbstractSyntaxTree
{
    public class FunctionParameterNode : Node
    {
        public IEnumerable<AttributeNode> Attributes { get; internal set; }

        public string Name { get; internal set; }   

        public TypeNameNode TypeName { get; internal set; }

        public FunctionParameterNode(string name, TypeNameNode typeName, IEnumerable<AttributeNode> attributes)
        {
            if (name == null) throw new ArgumentNullException("name", "The name is ");
            if (typeName == null) throw new ArgumentNullException("typeName");

            Name = name;
            TypeName = typeName;
            Attributes = (attributes ?? new List<AttributeNode>()).ToList();
        }
    }
}
