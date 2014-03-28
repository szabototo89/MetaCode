using System;

namespace MetaCode.Compiler.AbstractSyntaxTree.Operators.Logical
{
    public abstract class LogicalBinaryOperatorNode : BinaryOperatorNode
    {
        public override Type Type
        {
            get { return typeof (bool); }
        }
    }
}