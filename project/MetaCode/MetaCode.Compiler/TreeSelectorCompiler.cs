using System.Collections.Generic;
using Antlr4.Runtime;
using MetaCode.Compiler.Grammar;
using MetaCode.Compiler.Selectors;
using MetaCode.Compiler.Visitors.TreeSelector;

namespace MetaCode.Compiler
{
    public class TreeSelectorCompiler
    {
        public IEnumerable<NodeSelector> Parse(string source)
        {
            var inputStream = new AntlrInputStream(source);
            var lexer = new TreeSelectorLexer(inputStream);
            var commonTokenStream = new CommonTokenStream(lexer);
            var parser = new TreeSelectorParser(commonTokenStream);
            var context = parser.init();
            var visitor = new TreeSelectorVisitor();
            return visitor.VisitInit(context);
        }

    }
}