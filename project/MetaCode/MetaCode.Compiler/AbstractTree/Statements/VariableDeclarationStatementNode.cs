using System;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractTree.Constants;
using MetaCode.Compiler.AbstractTree.Expressions;
using MetaCode.Compiler.Commons;
using MetaCode.Compiler.Helpers;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractTree.Statements
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
