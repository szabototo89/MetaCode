using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Operators
{
    public class MultiplicationOperatorNode : NumericBinaryOperatorNode
    {
        public override string Operator
        {
            get { return "*"; }
        }
    }

    public abstract class NumericBinaryOperatorNode : BinaryOperatorNode
    {
        public override Type Type
        {
            get { return typeof (Double); }
        }
    }
}
