using System;
using System.Linq;
using System.Linq.Expressions;
using MetaCode.Compiler.AbstractTree.Constants;
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

        public IfStatementNode IfThenElse(ExpressionNode condition, StatementNodeBase trueStatement, StatementNodeBase falseStatement = null)
        {
            if (condition == null)
                ThrowHelper.ThrowArgumentNullException(() => condition);
            if (trueStatement == null)
                ThrowHelper.ThrowArgumentNullException(() => trueStatement);
            if (falseStatement == null)
                falseStatement = EmptyBlock();

            if (condition.Type != typeof(bool))
                CompilerService.Error("Condition must be logical expression!");

            return new IfStatementNode(condition, trueStatement, falseStatement);
        }

        public SkipStatementNode Skip()
        {
            return new SkipStatementNode();
        }

        public ForeachLoopStatementNode Foreach(Variable variable, ExpressionNode expression, StatementNodeBase body, bool createLoopVariable)
        {
            if (variable == null)
                ThrowHelper.ThrowArgumentNullException(() => variable);
            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);
            if (body == null)
                ThrowHelper.ThrowArgumentNullException(() => body);

            if (!expression.Type.IsEnumerable())
                CompilerService.Error("The expression of foreach must be enumerable!");

            return new ForeachLoopStatementNode(variable, expression, body);
        }

        public WhileLoopStatementNode While(ExpressionNode condition, StatementNodeBase body)
        {
            if (condition == null)
                ThrowHelper.ThrowArgumentNullException(() => condition);

            if (!condition.Type.IsLogical())
                CompilerService.Error("Condition of while must be logical expression!");

            if (!condition.Type.IsEnumerable())
                CompilerService.Error("The while condition must be a logical expression!");

            return new WhileLoopStatementNode(condition, body);
        }

        public ExpressionStatementNode Expression(ExpressionNode expression)
        {
            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);

            return new ExpressionStatementNode(expression);
        }

        public VariableDeclarationStatementNode DeclareVariable(string name, TypeNameNode typeName, ExpressionNode initialValue)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The name is blank!");

            Type type = null;

            if (typeName == null) {
                if (initialValue == null)
                    CompilerService.Error("Invalid variable declaration! You must define the type of variable!");
                else
                    type = initialValue.Type;
            }
            else
                type = typeName.Type;

            var scope = CompilerService.GetScope();
            var declaration = scope.DeclareVariable(name, type);

            if (initialValue == null) {
                ConstantLiteralNode constant = null;
                if (type.IsLogical())
                    constant = new BooleanConstantLiteralNode(false);
                else if (type.IsNumeric())
                    constant = new NumberConstantLiteralNode(0);
                else if (type.IsClass)
                    constant = new NullConstantLiteralNode(type);

                initialValue = new ConstantExpressionNode(constant, null);
            }

            return new VariableDeclarationStatementNode(declaration, initialValue);
        }

        public BlockStatementNode EmptyBlock()
        {
            return Block(() => new StatementNodeBase[0]);
        }

        public BlockStatementNode Block(Func<StatementNodeBase[]> statementsFunction)
        {
            if (statementsFunction == null)
                ThrowHelper.ThrowArgumentNullException(() => statementsFunction);

            var scope = CompilerService.PushScope();

            var statements = statementsFunction();

            if (statements.Any(statement => statement == null))
                ThrowHelper.ThrowException("There is a statement which is null!");

            CompilerService.PopScope();

            return new BlockStatementNode(statements, scope);
        }
    }
}