using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Constants
{
    public class NullConstantLiteralNode : ConstantLiteralNode<System.Object>
    {
        public NullConstantLiteralNode(Type type)
            : base(null, type)
        {
        }
    }
}
