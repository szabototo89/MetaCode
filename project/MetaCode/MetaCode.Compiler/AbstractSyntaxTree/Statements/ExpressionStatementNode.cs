using System;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class ExpressionStatementNode : StatementNodeBase
    {
        public ExpressionNode Expression { get; protected set; }

        public ExpressionStatementNode(ExpressionNode expression)
        {
            if (expression == null)
                throw new ArgumentNullException("expression", "The expression is null!");

            Expression = expression;
        }

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(new[] { Expression }); }
        }
    }
}
