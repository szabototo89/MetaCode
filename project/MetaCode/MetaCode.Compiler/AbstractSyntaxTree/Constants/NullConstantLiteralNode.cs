using System;

namespace MetaCode.Compiler.AbstractSyntaxTree.Constants
{
    public class NullConstantLiteralNode : ConstantLiteralNode<System.Object>
    {
        public NullConstantLiteralNode()
            : base(null)
        {
        }
    }
}
