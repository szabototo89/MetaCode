using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Statements
{
    public abstract class LoopStatementNode : StatementNode
    {
        public StatementNode Body { get; internal set; }

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(new[] { Body }); }
        }

        protected LoopStatementNode(StatementNode body)
        {
            Body = body;
            AddChildren(Body);
        }
    }
}
