using System;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class IfStatementNode : StatementNodeBase
    {
        public ExpressionNode ConditionExpression { get; protected set; }

        public BlockStatementNode TrueStatementNode { get; protected set; }

        public BlockStatementNode FalseStatementNode { get; protected set; }

        public IfStatementNode(ExpressionNode condition, BlockStatementNode trueStatement, BlockStatementNode falseStatement)
        {
            if (condition == null) throw new ArgumentNullException("condition");
            if (trueStatement == null) throw new ArgumentNullException("trueStatement");
            if (falseStatement == null) throw new ArgumentNullException("falseStatement");

            ConditionExpression = condition;
            TrueStatementNode = trueStatement;
            FalseStatementNode = falseStatement;

            AddChildren(condition, trueStatement, falseStatement);
        }
    }
}
