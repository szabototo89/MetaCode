using System;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree
{
    public class TypeNameNode : Node
    {
        public Type Type { get; protected set; }

        public TypeNameNode(Type type)
        {
            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            Type = type;
        }
    }
}
