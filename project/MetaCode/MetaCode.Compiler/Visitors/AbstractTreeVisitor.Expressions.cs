using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractTree;
using MetaCode.Compiler.Grammar;
using MetaCode.Core;

namespace MetaCode.Compiler.Visitors
{
    public partial class AbstractTreeVisitor
    {
        #region Expression Visitor methods

        public override INode VisitExpression(MetaCodeParser.ExpressionContext context)
        {
            var attributes = context.Attributes.With(value => value.Accept(this));

            if (context.Constant != null)
                return new ConstantExpressionNode(context.Constant.Accept(this) as IConstantLiteralNode, null);

            return base.VisitExpression(context);
        }

        #endregion
    }
}
