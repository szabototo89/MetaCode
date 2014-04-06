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

        public IfStatementNode IfThenElse(ExpressionNode condition, BlockStatementNode trueStatement, IEnumerable<AttributeNode> attributes)
        {
            return IfThenElse(condition, trueStatement, new IfStatementNode[0], EmptyBlock(), attributes);
        }

        public IfStatementNode IfThenElse(ExpressionNode condition, BlockStatementNode trueStatement, IfStatementNode[] elseIfStatements, IEnumerable<AttributeNode> attributes)
        {
            return IfThenElse(condition, trueStatement, elseIfStatements, EmptyBlock(), attributes);
        }

        public IfStatementNode IfThenElse(ExpressionNode condition, BlockStatementNode trueStatement, IfStatementNode[] elseIfStatements, BlockStatementNode falseStatement, IEnumerable<AttributeNode> attributes)
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
                        new StatementNodeBase[]{
                                                   IfThenElse(elseIf.ConditionExpression, elseIf.TrueStatementNode, elseIfStatements.Skip(1).ToArray(), new AttributeNode[0])
                                               }
                    );
            }

            return new IfStatementNode(condition, trueStatement, falseStatement, attributes);
        }

        public SkipStatementNode Skip()
        {
            return new SkipStatementNode();
        }

        public ForeachLoopStatementNode Foreach(string variable, TypeNameNode variableType, ExpressionNode expression, StatementNodeBase body)
        {
            return Foreach(variable, variableType, expression, body, new AttributeNode[0]);
        }

        public ForeachLoopStatementNode Foreach(string variable, TypeNameNode variableType, ExpressionNode expression, StatementNodeBase body, AttributeNode[] attributes)
        {
            if (string.IsNullOrWhiteSpace(variable))
                ThrowHelper.ThrowException("The 'variable' is blank!");
            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);
            if (body == null)
                ThrowHelper.ThrowArgumentNullException(() => body);
            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            return new ForeachLoopStatementNode(variable, variableType, expression, body, attributes);
        }

        public WhileLoopStatementNode While(ExpressionNode condition, StatementNodeBase body, AttributeNode[] attributes)
        {
            if (condition == null)
                ThrowHelper.ThrowArgumentNullException(() => condition);

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            return new WhileLoopStatementNode(condition, body, attributes);
        }

        public ExpressionStatementNode Expression(ExpressionNode expression)
        {
            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);

            return new ExpressionStatementNode(expression);
        }

        public VariableDeclarationStatementNode DeclareVariable(string name, TypeNameNode typeName, ExpressionNode initialValue)
        {
            return DeclareVariable(name, typeName, initialValue, new AttributeNode[0]);
        }

        public VariableDeclarationStatementNode DeclareVariable(string name, TypeNameNode typeName, ExpressionNode initialValue, AttributeNode[] attributes)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The name is blank!");

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            return new VariableDeclarationStatementNode(name, typeName, initialValue, attributes);
        }

        public BlockStatementNode EmptyBlock()
        {
            return Block(new StatementNodeBase[0]);
        }

        public BlockStatementNode Block(StatementNodeBase[] statements)
        {
            return Block(statements, new AttributeNode[0]);
        }

        public BlockStatementNode Block(StatementNodeBase[] statements, AttributeNode[] attributes)
        {
            if (statements == null) throw new ArgumentNullException("statements");
            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            return new BlockStatementNode(statements, attributes);
        }

        public FunctionDeclarationStatementNode Function(string name, TypeNameNode returnType, FormalParameterNode[] parameters, ExpressionNode body, AttributeNode[] attributes)
        {
            var statementFactory = CompilerService.StatementFactory;

            return Function(name, returnType, parameters, statementFactory.Block(new StatementNodeBase[] { statementFactory.Expression(body) }), attributes);
        }

        public FunctionDeclarationStatementNode Function(string name, TypeNameNode returnType, FormalParameterNode[] parameters, BlockStatementNode body, AttributeNode[] attributes)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (body == null)
                ThrowHelper.ThrowArgumentNullException(() => body);
            if (parameters == null)
                ThrowHelper.ThrowArgumentNullException(() => parameters);
            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            var type = returnType ?? new TypeNameNode("void");

            return new FunctionDeclarationStatementNode(name, body, type, parameters, attributes);
        }

        public FormalParameterNode FormalParameter(string name, TypeNameNode type)
        {
            return FormalParameter(name, type, new AttributeNode[0]);
        }

        public FormalParameterNode FormalParameter(string name, TypeNameNode type, IEnumerable<AttributeNode> attributes)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The name is blank!");
            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            return new FormalParameterNode(name, type, attributes);
        }

        public AttributeDeclarationStatementNode Attribute(string name, FormalParameterNode[] parameters, AttributeNode[] attributes)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");
            if (parameters == null)
                ThrowHelper.ThrowArgumentNullException(() => parameters);
            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            return new AttributeDeclarationStatementNode(name, parameters, attributes);
        }

        public ObjectDeclarationStatementNode Object(string name, FormalParameterNode[] parameters)
        {
            return Object(name, parameters, new AttributeNode[0]);
        }

        public ObjectDeclarationStatementNode Object(string name, FormalParameterNode[] parameters, AttributeNode[] attributes)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");
            if (parameters == null)
                ThrowHelper.ThrowArgumentNullException(() => parameters);
            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            return new ObjectDeclarationStatementNode(name, parameters, attributes);
        }

        public ReturnStatementNode Return(ExpressionNode expression)
        {
            if (expression == null)
                ThrowHelper.ThrowArgumentNullException(() => expression);

            return new ReturnStatementNode(expression);
        }

        public CompilationUnit CompilationUnit(BlockStatementNode block)
        {
            if (block == null)
                ThrowHelper.ThrowArgumentNullException(() => block);

            return new CompilationUnit(block.Statements);
        }
    }
}