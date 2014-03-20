using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using MetaCode.Compiler.AbstractTree;
using MetaCode.Compiler.Commons;
using MetaCode.Core;

namespace MetaCode.Compiler.Visitors
{
    public partial class AbstractTreeVisitor
    {
        private Node GetNodeFromContext(params ParserRuleContext[] contexts)
        {
            if (contexts == null)
                ThrowHelper.ThrowArgumentNullException(() => contexts);

            return contexts.FirstOrDefault(context => context != null)
                           .With(context => context.Accept(this));
        }

        private void UpdateLocation(ParserRuleContext context)
        {
            if (context == null)
                ThrowHelper.ThrowArgumentNullException(() => context);

            var start = new TextLocation(context.Start.Line, context.Start.StartIndex);
            var end = new TextLocation(context.Stop.Line, context.Stop.StopIndex);

            CompilerService.CurrentSpan = new TextSpan(start, end);
        }
    }
}
