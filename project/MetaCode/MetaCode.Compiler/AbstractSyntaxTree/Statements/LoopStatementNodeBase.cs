using System.Collections.Generic;
using System.Linq;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public abstract class LoopStatementNodeBase : StatementNodeBase
    {
        public StatementNodeBase Body { get; internal set; }

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(new[] { Body }); }
        }

        protected LoopStatementNodeBase(StatementNodeBase body)
        {
            Body = body;
            AddChildren(Body);
        }
    }
}
