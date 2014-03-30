using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.Selectors
{
    public abstract class NodeSelector
    {
        public IEnumerable<NodeSelectorAttribute> Attributes { get; protected set; }
    }
}
