using System;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.Commons;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class VariableDeclarationStatementNode : StatementNodeBase, ISupportAttributes
    {
        public IdentifierExpressionNode Identifier { get; protected set; }

        public TypeNameNode VariableType { get; set; }

        public ExpressionNode InitialValue { get; protected set; }

        public string VariableName { get { return Identifier.Name; } }

        public List<AttributeNode> Attributes { get; protected set; }

        public VariableDeclarationStatementNode(string name, TypeNameNode variableType, ExpressionNode initialValue, AttributeNode[] attributes)
        {
            if (name == null)
                ThrowHelper.ThrowArgumentNullException(() => name);

            if (variableType == null)
                ThrowHelper.ThrowArgumentNullException(() => variableType);

            if (initialValue == null)
                ThrowHelper.ThrowArgumentNullException(() => initialValue);

            InitialValue = initialValue;
            Identifier = new IdentifierExpressionNode(name, null);
            VariableType = variableType;
            Attributes = attributes.ToList();

            AddChildren(Identifier, VariableType, InitialValue);
            AddChildren(Attributes);
        }
    }
}
