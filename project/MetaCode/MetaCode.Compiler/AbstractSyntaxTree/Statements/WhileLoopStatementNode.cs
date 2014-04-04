using System;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class WhileLoopStatementNode : LoopStatementNodeBase
    {
        public ExpressionNode Condition { get; set; }

        public WhileLoopStatementNode(ExpressionNode condition, StatementNodeBase body)
            : base(body)
        {
            if (condition == null)
                throw new ArgumentNullException("condition", "The Condition is null!");

            Condition = condition;
            AddChildren(Condition);
        }

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(new[] { Condition }); }
        }
    }
}
