using System.Collections.Generic;
using System.IO.Pipes;
using System.Linq;
using MetaCode.Compiler.Commons;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class BlockStatementNode : StatementNodeBase
    {
        public IEnumerable<StatementNodeBase> Statements { get; protected set; }

        public List<AttributeNode> Attributes { get; protected set; }

        public Scope Scope { get; protected set; }

        public BlockStatementNode(IEnumerable<StatementNodeBase> statements, IEnumerable<AttributeNode> attributes)
        {
            if (statements == null)
                ThrowHelper.ThrowArgumentNullException(() => statements);

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            Statements = statements;
            Attributes = attributes.ToList();

            AddChildren(Statements);
            AddChildren(Attributes);
        }

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(Statements); }
        }
    }
}
