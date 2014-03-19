using System;
using System.Collections.Generic;
using MetaCode.Compiler.AbstractTree.Constants;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractTree.Expressions
{
    public class ConstantExpressionNode : PrimaryExpressionNode
    {
        #region Public properties

        public ConstantLiteralNode Constant { get; set; }

        public override Type Type { get { return Constant.Type; } }

        #endregion

        #region Constructors

        public ConstantExpressionNode(ConstantLiteralNode constant, IEnumerable<AttributeNode> attributes)
            : base(attributes)
        {
            if (constant == null)
                ThrowHelper.ThrowArgumentNullException(() => constant);

            Constant = constant;
            AddChildren(Constant);
        }

        #endregion
    }
}