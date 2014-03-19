using System;

namespace MetaCode.Compiler.AbstractTree
{
    public class Identifier : Node
    {
        public Identifier(string name)
        {
            if (string.IsNullOrWhiteSpace(name)) 
                throw new ArgumentException("The name is blank!", "name");
            
            Name = name;
        }

        public string Name { get; protected set; }
    }
}