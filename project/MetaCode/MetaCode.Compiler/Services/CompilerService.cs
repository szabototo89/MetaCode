using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Dfa;
using MetaCode.Compiler.AbstractTree.Statements;
using MetaCode.Core;

namespace MetaCode.Compiler.Services
{
    public class CompilerService
    {
        public Dictionary<string, List<VariableDeclarationStatementNode>> Variables { get; protected set; }

        public CompilerService()
        {
            Variables = new Dictionary<string, List<VariableDeclarationStatementNode>>();
        }

        public CompilerService WriteError(string message)
        {
            return this;
        }

        public static CompilerService Instance
        {
            get { return Singleton<CompilerService>.Instance; }
        }
    }
}
