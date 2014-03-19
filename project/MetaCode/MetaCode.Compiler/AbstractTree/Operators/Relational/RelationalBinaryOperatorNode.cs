using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Operators.Relational
{
    public abstract class RelationalBinaryOperatorNode : BinaryOperatorNode
    {
        public override Type Type
        {
            get { return typeof(Boolean); }
        }
    }
}
