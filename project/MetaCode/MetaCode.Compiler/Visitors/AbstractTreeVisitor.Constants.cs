using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using MetaCode.Compiler.AbstractTree;
using MetaCode.Compiler.AbstractTree.Constants;
using MetaCode.Compiler.AbstractTree.Expressions;
using MetaCode.Compiler.Grammar;
using MetaCode.Core;

namespace MetaCode.Compiler.Visitors
{
    public partial class AbstractTreeVisitor : MetaCodeBaseVisitor<Node>
    {
        #region Constants Visitor methods

        public override Node VisitNumberConstant(MetaCodeParser.NumberConstantContext context)
        {
            var text = context.GetText();
            double result;

            if (!double.TryParse(text, out result))
                throw new InvalidCastException();

            return new NumberConstantLiteralNode(result);
        }

        public override Node VisitStringConstant(MetaCodeParser.StringConstantContext context)
        {
            return new StringConstantLiteralNode(context.GetText().Trim('"'));
        }

        public override Node VisitBooleanConstant(MetaCodeParser.BooleanConstantContext context)
        {
            var text = context.GetText();
            Boolean result;

            if (!Boolean.TryParse(text, out result))
                throw new InvalidCastException();

            return new BooleanConstantLiteralNode(result);
        }

        public override Node VisitArrayConstant(MetaCodeParser.ArrayConstantContext context)
        {
            var text = context.GetText();
            var expressions = context.expression()
                .Select(expression => expression.Accept(this))
                .OfType<ExpressionNode>()
                .ToArray();

            return new ArrayConstantLiteralNode(expressions);
        }

        public override Node VisitConstant(MetaCodeParser.ConstantContext context)
        {
            var result = (context.String.As<ParserRuleContext>() ??
                          context.Number.As<ParserRuleContext>() ??
                          context.Boolean.As<ParserRuleContext>() ??
                          context.Array.As<ParserRuleContext>() ??
                          context.Interval.As<ParserRuleContext>()).Accept(this);
            return result;
        }

        #endregion
    }
}
