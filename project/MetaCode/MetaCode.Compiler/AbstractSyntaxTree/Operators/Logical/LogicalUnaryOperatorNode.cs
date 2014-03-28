using System;

namespace MetaCode.Compiler.AbstractSyntaxTree.Operators.Logical
{
    public abstract class LogicalUnaryOperatorNode : UnaryOperatorNode
    {
        public override Type Type
        {
            get { return typeof (bool); }
        }
    }
}