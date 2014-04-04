using System;
using System.Collections.Generic;
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

            if (elseIfStatements.Any()) {
                var elseIf = elseIfStatements.First();
                falseStatement =
                    Block(
                        new StatementNodeBase[]
                            {
                                IfThenElse(elseIf.ConditionExpression, elseIf.TrueStatementNode, elseIfStatements.Skip(1).ToArray())
                            }
                    );
            }

            return new IfStatementNode(condition, trueStatement, falseStatement);
        }

        public SkipStatementNode Skip()
        {
            return new SkipStatementNode();
        }

        public ForeachLoopStatementNode Foreach(string variable, TypeNameNode variableType, ExpressionNode expression, StatementNodeBase body, bool createLoopVariable)
        {
            if (string.IsNullOrWhiteSpace(variable))
                ThrowHelper.ThrowException("The variable is blank!");
            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);
            if (body == null)
                ThrowHelper.ThrowArgumentNullException(() => body);

            VariableDeclaration variableNode = null;

            if (createLoopVariable) {
                return new ForeachLoopStatementNode(variableNode, expression, body);
            }

            variableNode = CompilerService.FindVariable(variable);
            return new ForeachLoopStatementNode(variableNode, expression, body);
        }

        public WhileLoopStatementNode While(ExpressionNode condition, StatementNodeBase body)
        {
            if (condition == null)
                ThrowHelper.ThrowArgumentNullException(() => condition);

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

            return new VariableDeclarationStatementNode(name, typeName, initialValue);
        }

        public BlockStatementNode EmptyBlock()
        {
            return Block(new StatementNodeBase[0]);
        }

        public BlockStatementNode Block(StatementNodeBase[] statements)
        {
            if (statements == null) throw new ArgumentNullException("statements");
            return new BlockStatementNode(statements);
        }

        public FunctionDeclarationStatementNode Function(string name, TypeNameNode returnType, FunctionParameterNode[] parameters, ExpressionNode body)
        {
            var statementFactory = CompilerService.StatementFactory;

            return Function(name, returnType, parameters, statementFactory.Block(new StatementNodeBase[] { statementFactory.Expression(body) }));
        }

        public FunctionDeclarationStatementNode Function(string name, TypeNameNode returnType, FunctionParameterNode[] parameters, BlockStatementNode body)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (body == null)
                ThrowHelper.ThrowArgumentNullException(() => body);
            if (parameters == null)
                ThrowHelper.ThrowArgumentNullException(() => parameters);

            var type = returnType ?? new TypeNameNode("void");

            return new FunctionDeclarationStatementNode(name, body, type, null);
        }

        public FunctionParameterNode FunctionFormalParameter(string name, TypeNameNode type, IEnumerable<AttributeNode> attributes)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The name is blank!");
            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            return new FunctionParameterNode(name, type, attributes);
        }

        public ReturnStatementNode Return(ExpressionNode expression)
        {
            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);

            return new ReturnStatementNode(expression);
        }
    }
}