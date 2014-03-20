using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using MetaCode.Compiler.Grammar;
using MetaCode.Compiler.Visitors;
using MetaCode.Core;

namespace MetaCode.Compiler
{
    public class MetaCodeCompiler
    {
        public TResult ParseWithVisitor<TResult, TVisitor>(string source)
            where TVisitor : MetaCodeBaseVisitor<TResult>, new()
        {
            return ParseWithVisitor<TResult, TVisitor>(source, () => new TVisitor());
        }

        public TResult ParseWithVisitor<TResult, TVisitor>(string source, Func<TVisitor> visitorInitializer)
            where TVisitor : MetaCodeBaseVisitor<TResult>
        {
            if (visitorInitializer == null)
                ThrowHelper.ThrowArgumentNullException(() => visitorInitializer);

            var inputStream = new AntlrInputStream(source);
            var lexer = new MetaCodeLexer(inputStream);
            var commonTokenStream = new CommonTokenStream(lexer);
            var parser = new MetaCodeParser(commonTokenStream);
            var context = parser.init();
            var visitor = visitorInitializer();
            return visitor.VisitInit(context);
        }

        public void Parse(string source)
        {
            var inputStream = new AntlrInputStream(source);
            var lexer = new MetaCodeLexer(inputStream);
            var commonTokenStream = new CommonTokenStream(lexer);
            var parser = new MetaCodeParser(commonTokenStream);
            var context = parser.init();
            var visitor = new AttributeVisitor();
            visitor.VisitInit(context);
        }
    }
}
