using System;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class IfStatementNode : StatementNodeBase, ISupportAttributes
    {
        public ExpressionNode ConditionExpression { get; protected set; }

        public BlockStatementNode TrueStatementNode { get; protected set; }

        public BlockStatementNode FalseStatementNode { get; protected set; }

        public List<AttributeNode> Attributes { get; protected set; }

        public IfStatementNode(ExpressionNode condition, BlockStatementNode trueStatement, BlockStatementNode falseStatement, IEnumerable<AttributeNode> attributes)
        {
            if (condition == null) throw new ArgumentNullException("condition");
            if (trueStatement == null) throw new ArgumentNullException("trueStatement");
            if (falseStatement == null) throw new ArgumentNullException("falseStatement");
            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            ConditionExpression = condition;
            TrueStatementNode = trueStatement;
            FalseStatementNode = falseStatement;
            Attributes = attributes.ToList();

            AddChildren(condition, trueStatement, falseStatement);
            AddChildren(Attributes);
        }
    }
}
