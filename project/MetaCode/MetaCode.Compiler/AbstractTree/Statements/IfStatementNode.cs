﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractTree.Expressions;

namespace MetaCode.Compiler.AbstractTree.Statements
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

            if (condition.Type != typeof(bool))
                throw new ArgumentException("The type of condition is not boolean!");

            ConditionExpression = condition;
            TrueStatementNode = trueStatement;
            FalseStatementNode = falseStatement;

            AddChildren(condition, trueStatement, falseStatement);
        }
    }
}
