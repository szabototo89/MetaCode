using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Statements
{
    public abstract class LoopStatement : StatementNode
    {
        public BlockStatement Body { get; internal set; }

        public override IEnumerable<Node> Children
        {
            get { yield return Body; }
        }
    }

    public class ForeachLoopStatement : LoopStatement
    {

    }
}
