using System;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class WhileLoopStatementNode : LoopStatementNodeBase
    {
        public ExpressionNode ConditionExpression { get; set; }

        public WhileLoopStatementNode(ExpressionNode conditionExpression, StatementNodeBase body, AttributeNode[] attributes)
            : base(body, attributes)
        {
            if (conditionExpression == null)
                throw new ArgumentNullException("conditionExpression", "The ConditionExpression is null!");

            ConditionExpression = conditionExpression;
            AddChildren(ConditionExpression);
        }

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(new[] { ConditionExpression }); }
        }
    }
}
