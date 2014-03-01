using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.Grammar;
using MetaCode.Core;

namespace MetaCode.Compiler.Visitors
{
    public class NumberVisitor : MetaCodeBaseVisitor<double>
    {
        public override double VisitFunctionExpression(MetaCodeParser.FunctionExpressionContext context)
        {
            return base.VisitFunctionExpression(context);
        }
    }
}
