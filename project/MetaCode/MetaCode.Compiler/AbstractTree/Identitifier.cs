using System;

namespace MetaCode.Compiler.AbstractTree
{
    public class Identitifier : Node
    {
        public Identitifier(string name)
        {
            if (string.IsNullOrWhiteSpace(name)) 
                throw new ArgumentException("The name is blank!", "name");
            
            Name = name;
        }

        public string Name { get; protected set; }
    }
}