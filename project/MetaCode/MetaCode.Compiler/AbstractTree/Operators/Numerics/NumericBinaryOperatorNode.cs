using System;

namespace MetaCode.Compiler.AbstractTree.Operators
{
    public abstract class NumericBinaryOperatorNode : BinaryOperatorNode
    {
        public override Type Type
        {
            get { return typeof(Double); }
        }
    }
}