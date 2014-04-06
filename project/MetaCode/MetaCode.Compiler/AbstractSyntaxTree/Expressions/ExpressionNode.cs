using System;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public abstract class ExpressionNode : Node
    {
        #region Public properties

        //public abstract VariableType VariableType { get; }

        #endregion

        #region Constructors

        protected ExpressionNode() { }

        #endregion
    }
}