using System;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree
{
    public class TypeNameNode : Node
    {
        public string Type { get; protected set; }

        public TypeNameNode(string type)
        {
            if (string.IsNullOrWhiteSpace(type))
                ThrowHelper.ThrowException("The 'type' is blank!");

            Type = type;
        }
    }
}
