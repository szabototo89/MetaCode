using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractTree.Expressions;

namespace MetaCode.Compiler.AbstractTree.Statements
{
    public class WhileLoopStatementNode : LoopStatementNode
    {
        public ExpressionNode Condition { get; set; }

        public WhileLoopStatementNode(ExpressionNode condition, StatementNode body)
            : base(body)
        {
            if (condition == null)
                throw new ArgumentNullException("condition", "The Condition is null!");

            if (condition.Type == null)
                throw new Exception("The type of Condition is null!");

            if (condition.Type != typeof(bool))
                throw new Exception("The type of Condition is not System.Boolean!");

            Condition = condition;
            SetParentOfNodes(Condition);
        }

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(new[] { Condition }); }
        }
    }
}
