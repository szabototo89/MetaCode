﻿using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Linq.Expressions;
using System.Net.Mime;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Constants;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.Grammar;
using MetaCode.Core;

namespace MetaCode.Compiler.Visitors
{
    public partial class AbstractTreeVisitor
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

        #region variable Visitor method


        #endregion

        #region Type name Visitor method

        public override Node VisitTypeName(MetaCodeParser.TypeNameContext context)
        {
            var identifiers = context.ID()
                                     .Select(id => id.GetText())
                                     .ToArray();

            return ExpressionFactory.Type(identifiers);
        }

        #endregion
    }
}
