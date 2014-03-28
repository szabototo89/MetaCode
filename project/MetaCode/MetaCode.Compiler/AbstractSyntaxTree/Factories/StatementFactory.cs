using System;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Constants;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.Commons;
using MetaCode.Compiler.Helpers;
using MetaCode.Compiler.Services;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Factories
{
    // TODO: Implement return statement!
    public class StatementFactory
    {
        public CompilerService CompilerService { get; protected set; }

        public StatementFactory(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            CompilerService = compilerService;
            CompilerService.StatementFactory = this;
        }

        public IfStatementNode IfThenElse(ExpressionNode condition, BlockStatementNode trueStatement)
        {
            return IfThenElse(condition, trueStatement, new IfStatementNode[0], null);
        }

        public IfStatementNode IfThenElse(ExpressionNode condition, BlockStatementNode trueStatement, IfStatementNode[] elseIfStatements, BlockStatementNode falseStatement = null)
        {
            if (condition == null)
                ThrowHelper.ThrowArgumentNullException(() => condition);
            if (trueStatement == null)
                ThrowHelper.ThrowArgumentNullException(() => trueStatement);
            if (falseStatement == null)
                falseStatement = EmptyBlock();

            if (condition.Type != typeof(bool))
                CompilerService.Error("Condition must be logical expression!");

            if (elseIfStatements.Any())
            {
                var elseIf = elseIfStatements.First();
                falseStatement =
                    Block(
                        new Lazy<StatementNodeBase[]>(
                            () => new StatementNodeBase[]
                            {
                                IfThenElse(elseIf.ConditionExpression, elseIf.TrueStatementNode, elseIfStatements.Skip(1).ToArray())
                            }
                        )
                    );
            }

            return new IfStatementNode(condition, trueStatement, falseStatement);
        }

        public SkipStatementNode Skip()
        {
            return new SkipStatementNode();
        }

        public ForeachLoopStatementNode Foreach(string variable, TypeNameNode variableType, ExpressionNode expression, Lazy<StatementNodeBase> body, bool createLoopVariable)
        {
            if (string.IsNullOrWhiteSpace(variable))
                ThrowHelper.ThrowException("The variable is blank!");
            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);
            if (body == null)
                ThrowHelper.ThrowArgumentNullException(() => body);

            if (!expression.Type.IsEnumerable())
                CompilerService.Error("The expression of foreach must be enumerable!");

            VariableDeclaration variableNode = null;

            if (createLoopVariable)
            {
                var scope = CompilerService.PushScope();
                variableNode = scope.DeclareVariable(variable, variableType.With(type => type.Type) ?? expression.Type.GetItemType());
                var statements = body.Value;
                CompilerService.PopScope();

                return new ForeachLoopStatementNode(variableNode, expression, statements);
            }

            variableNode = CompilerService.FindVariable(variable);
            return new ForeachLoopStatementNode(variableNode, expression, body.Value);
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

            if (typeName == null)
            {
                if (initialValue == null)
                    CompilerService.Error("Invalid variable declaration! You must define the type of variable!");
                else
                    type = initialValue.Type;
            }
            else
                type = typeName.Type;

            var scope = CompilerService.GetScope();
            var declaration = scope.DeclareVariable(name, type);

            if (initialValue == null)
            {
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
            return Block(new Lazy<StatementNodeBase[]>(() => new StatementNodeBase[0]));
        }

        public BlockStatementNode Block(Lazy<StatementNodeBase[]> statementsFunction)
        {
            if (statementsFunction == null)
                ThrowHelper.ThrowArgumentNullException(() => statementsFunction);

            var scope = CompilerService.PushScope();

            var statements = statementsFunction.Value;

            if (statements.Any(statement => statement == null))
                ThrowHelper.ThrowException("There is a statement which is null!");

            CompilerService.PopScope();

            return new BlockStatementNode(statements, scope);
        }
    }
}