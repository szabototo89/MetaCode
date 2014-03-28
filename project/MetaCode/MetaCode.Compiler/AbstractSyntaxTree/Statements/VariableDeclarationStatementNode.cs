using System;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.Commons;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class VariableDeclarationStatementNode : StatementNodeBase
    {
        public string Name { get { return VariableDeclaration.Name; } }

        public Type Type { get { return VariableDeclaration.Type; } }

        public VariableDeclaration Declaration { get; set; }

        public ExpressionNode InitialValue { get; protected set; }

        public VariableDeclaration VariableDeclaration { get; protected set; }

        public VariableDeclarationStatementNode(VariableDeclaration declaration, ExpressionNode initialValue)
        {
            if (declaration == null)
                ThrowHelper.ThrowArgumentNullException(() => declaration);

            Declaration = declaration;
            InitialValue = initialValue;

            AddChildren(InitialValue);
        }
    }
}
