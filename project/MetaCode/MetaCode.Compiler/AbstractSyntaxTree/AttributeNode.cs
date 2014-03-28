using System;

namespace MetaCode.Compiler.AbstractSyntaxTree
{
    public class AttributeNode : Node
    {
        public string Name { get; protected set; }

        public AttributeNode(string name)
        {
            if (string.IsNullOrWhiteSpace(name)) 
                throw new ArgumentNullException("name", "The name is blank!");
            Name = name;
        }
    }
}