using System;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.Commons;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class VariableDeclarationStatementNode : StatementNodeBase
    {
        public IdentifierExpressionNode Identifier { get; protected set; }

        public TypeNameNode Type { get; set; }

        public ExpressionNode InitialValue { get; protected set; }

        public string VariableName { get { return Identifier.Name; } }

        public VariableDeclarationStatementNode(string name, TypeNameNode type, ExpressionNode initialValue)
        {
            if (name == null)
                ThrowHelper.ThrowArgumentNullException(() => name);

            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            if (initialValue == null)
                ThrowHelper.ThrowArgumentNullException(() => initialValue);

            InitialValue = initialValue;
            Identifier = new IdentifierExpressionNode(name, null);
            Type = type;

            AddChildren(Identifier, Type, InitialValue);
        }
    }
}
