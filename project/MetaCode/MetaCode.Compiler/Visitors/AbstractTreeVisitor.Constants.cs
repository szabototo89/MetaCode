using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Net.Mime;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using MetaCode.Compiler.AbstractTree;
using MetaCode.Compiler.AbstractTree.Constants;
using MetaCode.Compiler.AbstractTree.Expressions;
using MetaCode.Compiler.AbstractTree.Factories;
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

            return ConstantLiteralFactory.Number(text);
        }

        public override Node VisitStringConstant(MetaCodeParser.StringConstantContext context)
        {
            return new StringConstantLiteralNode(context.GetText().Trim('"'));
        }

        public override Node VisitBooleanConstant(MetaCodeParser.BooleanConstantContext context)
        {
            var text = context.GetText();
           
            return ConstantLiteralFactory.Logical(text);
        }

        public override Node VisitArrayConstant(MetaCodeParser.ArrayConstantContext context)
        {
            var text = context.GetText();
            var expressions = context.expression()
                .Select(expression => expression.Accept(this))
                .OfType<ExpressionNode>()
                .ToArray();

            return ConstantLiteralFactory.Array(expressions);
        }

        public override Node VisitConstant(MetaCodeParser.ConstantContext context)
        {
            return GetNodeFromContext(context.String,
                                      context.Number,
                                      context.Boolean,
                                      context.Array,
                                      context.Interval);
        }

        #endregion
    }
}
