using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Statements
{
    public class BlockStatementNode : StatementNode
    {
        public IEnumerable<Variable> Variables { get; protected set; }

        public IEnumerable<StatementNode> Statements { get; protected set; }

        public BlockStatementNode(IEnumerable<StatementNode> statements)
        {
            if (statements == null)
                throw new ArgumentNullException("statements", "The statements is null");

            Statements = statements.Select(statement =>
            {
                statement.SetParent(this);
                return statement;
            });
        }
    }
}
