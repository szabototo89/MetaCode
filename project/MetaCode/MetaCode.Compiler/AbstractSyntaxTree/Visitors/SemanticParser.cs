using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Security.AccessControl;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.Helpers;
using MetaCode.Compiler.Services;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Visitors
{
    public class SemanticParser : TreeVisitorBase<SemanticParser>
    {
        public CompilerService CompilerService { get; protected set; }

        public DeclarationAnalyzer DeclarationAnalyzer { get; protected set; }

        public ExpressionTypeAnalyzer ExpressionTypeAnalyzer { get; protected set; }

        public SemanticParser(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            CompilerService = compilerService;
            DeclarationAnalyzer = new DeclarationAnalyzer(compilerService);
            ExpressionTypeAnalyzer = new ExpressionTypeAnalyzer(compilerService);
        }

        public void Visit(CompilationUnit compilationUnit)
        {
            if (compilationUnit == null)
                ThrowHelper.ThrowArgumentNullException(() => compilationUnit);

            DeclarationAnalyzer.VisitChild(compilationUnit);
            ExpressionTypeAnalyzer.VisitChild(compilationUnit);

            VisitChild(compilationUnit);
        }
    }
}
