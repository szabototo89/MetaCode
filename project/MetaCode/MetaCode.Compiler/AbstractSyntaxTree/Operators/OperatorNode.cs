using System;

namespace MetaCode.Compiler.AbstractSyntaxTree.Operators
{
    public abstract class OperatorNode : Node
    {
        public abstract string Operator { get; }

        public abstract Type Type { get; }
    }
}
