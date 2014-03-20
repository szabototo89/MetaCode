using MetaCode.Core;
using System;
using System.Reflection;

namespace MetaCode.Compiler.AbstractTree
{
    public class Identifier : Node
    {
        public Identifier(string name, Type type)
        {
            if (string.IsNullOrWhiteSpace(name)) 
                throw new ArgumentException("The name is blank!", "name");

            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            Name = name;
            Type = type;
        }

        public string Name { get; protected set; }
        public Type Type { get; protected set; }
    }
}