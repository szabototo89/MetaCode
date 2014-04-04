using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.Commons;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class BlockStatementNode : StatementNodeBase
    {
        public IEnumerable<StatementNodeBase> Statements { get; protected set; }

        public Scope Scope { get; protected set; }

        public BlockStatementNode(IEnumerable<StatementNodeBase> statements)
        {
            if (statements == null)
                ThrowHelper.ThrowArgumentNullException(() => statements);

            Statements = statements.Select(statement => {
                statement.SetParent(this);
                return statement;
            }).ToArray();
        }

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(Statements); }
        }
    }
}
