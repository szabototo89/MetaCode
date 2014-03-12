using System;
using MetaCode.Compiler.AbstractTree.Expressions;

namespace MetaCode.Compiler.AbstractTree.Statements
{
    public class ForeachLoopStatementNode : LoopStatementNode
    {
        public Variable LoopVariable { get; protected set; }

        public ExpressionNode Expression { get; protected set; }

        public ForeachLoopStatementNode(Variable loopVariable, ExpressionNode expression, BlockStatementNode body)
            : base(body)
        {
            if (loopVariable == null) throw new ArgumentNullException("loopVariable", "The loopVariable is null!");
            if (expression == null) throw new ArgumentNullException("expression", "The expression is null!");
            
            LoopVariable = loopVariable;
            Expression = expression;
        }
    }
}