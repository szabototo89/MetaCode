using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Operators.Numerics
{
    public class SubtractionOperatorNode : NumericBinaryOperatorNode
    {
        public override string Operator
        {
            get { return "-"; }
        }
    }
}
