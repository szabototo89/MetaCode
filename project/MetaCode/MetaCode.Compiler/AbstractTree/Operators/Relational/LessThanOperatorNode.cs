using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Operators.Relational
{
    public class LessThanOperatorNode : RelationalBinaryOperatorNode
    {
        public override string Operator
        {
            get { return "<"; }
        }
    }
}
