using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Operators.Logical
{
    public class DisjunctionOperatorNode : LogicalBinaryOperatorNode
    {
        public override string Operator
        {
            get { return "or"; }
        }
    }
}
