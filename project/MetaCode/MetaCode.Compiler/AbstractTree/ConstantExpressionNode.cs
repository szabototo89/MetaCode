using System;
using System.Collections.Generic;
using System.ComponentModel.Design.Serialization;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractTree
{
    public class ConstantExpressionNode : ExpressionNode, IConstantExpressionNode
    {
        #region Public properties

        public IConstantLiteralNode Constant { get; private set; }

        public override Type Type { get { return Constant.Type; } }

        #endregion

        #region Constructors

        public ConstantExpressionNode(IConstantLiteralNode constant, IEnumerable<IAttributeNode> attributes)
            : base(attributes)
        {
            if (constant == null)
                ThrowHelper.ThrowArgumentNullException(() => constant);

            constant.ToNode().SetParent(this);
            Constant = constant;
        }

        #endregion
    }
}