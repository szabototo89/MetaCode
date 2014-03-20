using System;

namespace MetaCode.Compiler.AbstractTree.Operators.Numerics
{
    public abstract class NumericBinaryOperatorNode : BinaryOperatorNode
    {
        public override Type Type
        {
            get { return typeof(Double); }
        }
    }
}