using System;
using System.Linq;
using System.Linq.Expressions;
using MetaCode.Compiler.AbstractTree.Expressions;
using MetaCode.Compiler.AbstractTree.Statements;
using MetaCode.Compiler.Grammar;
using MetaCode.Compiler.Helpers;
using MetaCode.Compiler.Services;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractTree.Factories
{
    public class StatementFactory
    {
        public CompilerService CompilerService { get; protected set; }

        public StatementFactory(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            CompilerService = compilerService;
        }

        public IfStatementNode IfThenElse(ExpressionNode condition, StatementNode trueStatement, StatementNode falseStatement = null)
        {
            if (condition == null)
                ThrowHelper.ThrowArgumentNullException(() => condition);
            if (trueStatement == null)
                ThrowHelper.ThrowArgumentNullException(() => trueStatement);
            if (falseStatement == null)
                falseStatement = Block();

            if (condition.Type != typeof (bool))
                CompilerService.Instance.Error("Condition must be logical expression!");

            return new IfStatementNode(condition, trueStatement, falseStatement);
        }

        public SkipStatementNode Skip()
        {
            return new SkipStatementNode();
        }

        public ForeachLoopStatementNode Foreach(Variable variable, ExpressionNode expression, StatementNode body)
        {
            if (variable == null)
                ThrowHelper.ThrowArgumentNullException(() => variable);
            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);
            if (body == null)
                ThrowHelper.ThrowArgumentNullException(() => body);

            if (!expression.Type.IsEnumerable())
                CompilerService.Instance.Error("The expression of foreach must be enumerable!");

            return new ForeachLoopStatementNode(variable, expression, body);
        }

        public WhileLoopStatementNode While(ExpressionNode condition, StatementNode body)
        {
            if (condition == null)
                ThrowHelper.ThrowArgumentNullException(() => condition);

            if (!condition.Type.IsEnumerable())
                CompilerService.Instance.Error("The while condition must be a logical expression!");

            return new WhileLoopStatementNode(condition, body);
        }

        public ExpressionStatementNode Expression(ExpressionNode expression)
        {
            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);

            return new ExpressionStatementNode(expression);
        }

        public StatementNode Block(params StatementNode[] statements)
        {
            if (statements == null)
                ThrowHelper.ThrowArgumentNullException(() => statements);

            if (!statements.All(statement => statements != null))
                ThrowHelper.ThrowException("There is a statement which is null!");

            return new BlockStatementNode(statements);
        }
    } 
}