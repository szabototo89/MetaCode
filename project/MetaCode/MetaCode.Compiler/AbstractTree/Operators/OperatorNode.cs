using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Operators
{
    public abstract class OperatorNode : Node
    {
        public abstract string Operator { get; }

        public abstract Type Type { get; }
    }
}
