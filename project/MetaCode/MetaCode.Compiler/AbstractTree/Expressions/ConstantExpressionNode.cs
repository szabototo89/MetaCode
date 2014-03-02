using System;
using System.Collections.Generic;
using MetaCode.Compiler.AbstractTree.Constants;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractTree.Expressions
{
    public class ConstantExpressionNode : ExpressionNode, IConstantExpressionNode
    {
        #region Public properties

        public ConstantLiteralNode Constant { get; set; }

        IConstantLiteralNode IConstantExpressionNode.Constant { get { return Constant; } }

        public override Type Type { get { return Constant.Type; } }

        #endregion

        #region Constructors

        public ConstantExpressionNode(ConstantLiteralNode constant, IEnumerable<AttributeNode> attributes)
            : base(attributes)
        {
            if (constant == null)
                ThrowHelper.ThrowArgumentNullException(() => constant);

            constant.SetParent(this);
            Constant = constant;
        }

        #endregion
    }
}