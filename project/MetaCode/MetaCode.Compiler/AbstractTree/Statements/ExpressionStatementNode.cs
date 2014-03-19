using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractTree.Expressions;

namespace MetaCode.Compiler.AbstractTree.Statements
{
    public class ExpressionStatementNode : StatementNode
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
