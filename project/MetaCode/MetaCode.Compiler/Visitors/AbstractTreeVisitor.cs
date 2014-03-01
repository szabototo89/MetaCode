using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using MetaCode.Compiler.AbstractTree;
using MetaCode.Compiler.Grammar;
using MetaCode.Core;

namespace MetaCode.Compiler.Visitors
{
    public class AbstractTreeVisitor : MetaCodeBaseVisitor<INode>
    {
        #region Constants Visitor methods

        public override INode VisitNumberConstant(MetaCodeParser.NumberConstantContext context)
        {
            var text = context.GetText();
            double result;

            if (!double.TryParse(text, out result))
                throw new InvalidCastException();

            return new NumberConstantLiteralNode(result);
        }

        public override INode VisitStringConstant(MetaCodeParser.StringConstantContext context)
        {
            return new StringConstantLiteralNode(context.GetText().Trim('"'));
        }

        public override INode VisitBooleanConstant(MetaCodeParser.BooleanConstantContext context)
        {
            var text = context.GetText();
            Boolean result;

            if (!Boolean.TryParse(text, out result))
                throw new InvalidCastException();

            return new BooleanConstantLiteralNode(result);
        }

        public override INode VisitArrayConstant(MetaCodeParser.ArrayConstantContext context)
        {
            var text = context.GetText();
            var expressions = context.expression()
                .Select(expression => expression.Accept(this))
                .OfType<IExpressionNode>();

            return base.VisitArrayConstant(context);
        }

        public override INode VisitConstant(MetaCodeParser.ConstantContext context)
        {
            var result = (context.String.As<ParserRuleContext>() ??
                          context.Number.As<ParserRuleContext>() ??
                          context.Boolean.As<ParserRuleContext>() ??
                          context.Array.As<ParserRuleContext>() ??
                          context.Interval.As<ParserRuleContext>()).Accept(this);
            return result;
        }

        #endregion

        #region Expression Visitor methods

        public override INode VisitExpression(MetaCodeParser.ExpressionContext context)
        {
            return base.VisitExpression(context);
        }

        #endregion
    }
}
