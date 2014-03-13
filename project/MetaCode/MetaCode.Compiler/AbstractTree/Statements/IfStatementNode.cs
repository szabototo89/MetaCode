using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractTree.Expressions;

namespace MetaCode.Compiler.AbstractTree.Statements
{
    public class IfStatementNode : StatementNode
    {
        public ExpressionNode ConditionExpression { get; protected set; }

        public StatementNode TrueStatementNode { get; protected set; }

        public StatementNode FalseStatementNode { get; protected set; }

        public IfStatementNode(ExpressionNode condition, StatementNode trueStatement, StatementNode falseStatement)
        {
            if (condition == null) throw new ArgumentNullException("condition");
            if (trueStatement == null) throw new ArgumentNullException("trueStatement");
            if (falseStatement == null) throw new ArgumentNullException("falseStatement");

            if (condition.Type == typeof(bool))
                throw new ArgumentException("The type of condition is not boolean!");

            ConditionExpression = condition;
            TrueStatementNode = trueStatement;
            FalseStatementNode = falseStatement;

            SetParentOfNodes(condition, trueStatement, falseStatement);
        }

        public override IEnumerable<Node> Children
        {
            get
            {
                return base.Children.Concat(new Node[] { ConditionExpression, TrueStatementNode, FalseStatementNode });
            }
        }
    }
}
