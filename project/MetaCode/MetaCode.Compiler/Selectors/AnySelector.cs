using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree;

namespace MetaCode.Compiler.Selectors
{
    public class AnySelector : NodeSelector
    {
        protected override bool FilterNode(Node node)
        {
            return true;
        }
    }
}
