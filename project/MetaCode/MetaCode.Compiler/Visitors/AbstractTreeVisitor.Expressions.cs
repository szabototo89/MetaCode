using System;
using System.CodeDom;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Net.Mime;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using MetaCode.Compiler.AbstractTree;
using MetaCode.Compiler.AbstractTree.Constants;
using MetaCode.Compiler.AbstractTree.Expressions;
using MetaCode.Compiler.AbstractTree.Factories;
using MetaCode.Compiler.Grammar;
using MetaCode.Core;

namespace MetaCode.Compiler.Visitors
{

    // TODO: Write visitor of expressions
    public partial class AbstractTreeVisitor
    {
        private Node VisitBinaryOperands(MetaCodeParser.ExpressionContext left, MetaCodeParser.ExpressionContext right,
            IToken @operator)
        {
            if (new object[] { left, right, @operator }.Any(obj => obj == null))
                return null;

            var leftExpression = left.Accept(this) as ExpressionNode;
            var rightExpression = right.Accept(this) as ExpressionNode;
            var operatorText = @operator.Text;

            return ExpressionFactory.BinaryOperand(leftExpression, rightExpression, operatorText);
        }

        public override Node VisitExpression(MetaCodeParser.ExpressionContext context)
        {
            var result = GetNodeFromContext(context.PrimaryExpression,
                                            context.FunctionCallExpression,
                                            context.MemberExpression) ??
                         VisitBinaryOperands(context.Left, context.Right, context.Operator);

            return result;
        }

        public override Node VisitPrimaryExpression(MetaCodeParser.PrimaryExpressionContext context)
        {
            if (context.Constant != null)
            {
                var constant = context.Constant.Accept(this) as ConstantLiteralNode;
                return ExpressionFactory.Constant(constant);
            }
            
            if (context.Id != null)
            {
                var id = context.Id.Accept(this);
                //ExpressionFactory.Identifier(id);
            }

            return base.VisitPrimaryExpression(context);
        }
    }

}
