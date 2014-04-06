using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Core;

namespace MetaCode.Compiler
{
    public class CompilationUnit : Node
    {
        public List<StatementNodeBase> Statements { get; protected set; }

        public CompilationUnit(IEnumerable<StatementNodeBase> statements)
        {
            if (statements == null)
                ThrowHelper.ThrowArgumentNullException(() => statements);

            Statements = statements.ToList();
            AddChildren(Statements);
        }
    }
}
