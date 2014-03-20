using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime.Dfa;
using MetaCode.Compiler.AbstractTree.Statements;
using MetaCode.Compiler.Commons;
using MetaCode.Core;

namespace MetaCode.Compiler.Services
{
    public class CompilerService
    {
        public List<string> Errors { get; protected set; }

        public List<string> Warnings { get; protected set; }

        public Dictionary<string, List<VariableDeclarationStatementNode>> Variables { get; protected set; }

        public CompilerService()
        {
            Variables = new Dictionary<string, List<VariableDeclarationStatementNode>>();
            Errors = new List<string>();
            Warnings = new List<string>();
        }

        public CompilerService Warning(string message)
        {
            Warnings.Add(string.Format("({0}:{1}) {2}", CurrentSpan.Start.Line, CurrentSpan.Start.Offset, message));
            return this;
        }

        public CompilerService Error(string message)
        {
            Errors.Add(string.Format("({0}:{1}) {2}", CurrentSpan.Start.Line, CurrentSpan.Start.Offset, message));
            return this;
        }

        public static CompilerService Instance
        {
            get { return Singleton<CompilerService>.Instance; }
        }

        public TextSpan CurrentSpan { get; set; }
    }
}
