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

        public BlockStatementNode(IEnumerable<StatementNodeBase> statements, Scope scope)
        {
            if (statements == null)
                ThrowHelper.ThrowArgumentNullException(() => statements);

            if (scope == null)
                ThrowHelper.ThrowArgumentNullException(() => scope);

            Statements = statements.Select(statement => {
                statement.SetParent(this);
                return statement;
            });

            Scope = scope;
        }

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(Statements); }
        }
    }
}
