using System;

namespace MetaCode.Compiler.AbstractSyntaxTree.Operators.Relational
{
    public abstract class RelationalBinaryOperatorNode : BinaryOperatorNode
    {
        public override Type Type
        {
            get { return typeof(Boolean); }
        }
    }
}
