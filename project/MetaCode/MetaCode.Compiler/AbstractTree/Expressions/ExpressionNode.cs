using System;
using System.Collections.Generic;
using System.Linq;

namespace MetaCode.Compiler.AbstractTree.Expressions
{
    public abstract class ExpressionNode : Node
    {
        #region Public properties

        public abstract Type Type { get; }

        #endregion

        #region Constructors

        protected ExpressionNode() { }

        #endregion
    }
}