using System;

namespace MetaCode.Compiler.AbstractSyntaxTree.Operators.Numerics
{
    public abstract class NumericBinaryOperatorNode : BinaryOperatorNode
    {
        public override Type Type
        {
            get { return typeof(Double); }
        }
    }
}