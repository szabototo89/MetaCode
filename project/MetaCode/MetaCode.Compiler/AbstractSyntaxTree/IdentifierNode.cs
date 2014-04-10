using System;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree
{
    public class IdentifierNode : Node
    {
        public IdentifierNode(string name)
        {
            if (string.IsNullOrWhiteSpace(name)) 
                throw new ArgumentException("The name is blank!", "name");

            Name = name;
        }

        public string Name { get; protected set; }
    }
}