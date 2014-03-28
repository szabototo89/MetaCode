using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Factories;
using MetaCode.Compiler.Services;
using MetaCode.Core;

namespace MetaCode.Compiler.Visitors
{
    public partial class AbstractTreeVisitor
    {
        public CompilerService CompilerService { get; protected set; }

        public StatementFactory StatementFactory { get; protected set; }

        public ExpressionFactory ExpressionFactory { get; protected set; }

        public ConstantLiteralFactory ConstantLiteralFactory { get; protected set; }

        public AbstractTreeVisitor(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            CompilerService = compilerService;

            ConstantLiteralFactory = new ConstantLiteralFactory(CompilerService);
            StatementFactory = new StatementFactory(CompilerService);
            ExpressionFactory = new ExpressionFactory(CompilerService);
        }

        public override Node VisitChildren(IRuleNode node)
        {
            UpdateLocation(node.RuleContext as ParserRuleContext);
            return base.VisitChildren(node);
        }
    }
}
