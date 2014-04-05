using System.Collections.Generic;
using System.Linq;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public abstract class LoopStatementNodeBase : StatementNodeBase
    {
        public StatementNodeBase Body { get; internal set; }

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(new[] { Body }); }
        }

        public List<AttributeNode> Attributes { get; protected set; }

        protected LoopStatementNodeBase(StatementNodeBase body, IEnumerable<AttributeNode> attributes)
        {
            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            Body = body;
            Attributes = attributes.ToList();

            AddChildren(Body);
            AddChildren(Attributes);
        }
    }
}
