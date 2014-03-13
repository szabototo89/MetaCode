using System;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Statements
{
    public class VariableDeclarationStatementNode : StatementNode
    {
        public Identitifier Identitifier { get; protected set; }

        public TypeNameNode Type { get; protected set; }

        public BlockStatementNode Scope { get; protected set; }
    }
}
