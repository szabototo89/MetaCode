using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Statements
{
    public abstract class LoopStatementNode : StatementNode
    {
        public BlockStatementNode Body { get; internal set; }

        public override IEnumerable<Node> Children
        {
            get { yield return Body; }
        }

        protected LoopStatementNode(BlockStatementNode body)
        {
            Body = body;
        }
    }
}
