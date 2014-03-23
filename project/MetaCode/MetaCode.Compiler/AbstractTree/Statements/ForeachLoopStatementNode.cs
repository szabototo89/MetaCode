using System;
using System.Collections.Generic;
using System.Configuration;
using System.Linq;
using MetaCode.Compiler.AbstractTree.Expressions;

namespace MetaCode.Compiler.AbstractTree.Statements
{
    public class ForeachLoopStatementNode : LoopStatementNodeBase
    {
        public Variable LoopVariable { get; protected set; }

        public ExpressionNode Expression { get; protected set; }

        public ForeachLoopStatementNode(Variable loopVariable, ExpressionNode expression, StatementNodeBase body)
            : base(body)
        {
            if (loopVariable == null) throw new ArgumentNullException("loopVariable", "The loopVariable is null!");
            if (expression == null) throw new ArgumentNullException("expression", "The expression is null!");

            LoopVariable = loopVariable;
            Expression = expression;

            AddChildren(loopVariable, expression, body);
        }

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(new Node[] { LoopVariable, Expression }); }
        }
    }
}