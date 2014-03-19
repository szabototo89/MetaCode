using System;

namespace MetaCode.Compiler.AbstractTree.Operators.Logical
{
    public abstract class LogicalUnaryOperatorNode : UnaryOperatorNode
    {
        public override Type Type
        {
            get { return typeof (bool); }
        }
    }
}