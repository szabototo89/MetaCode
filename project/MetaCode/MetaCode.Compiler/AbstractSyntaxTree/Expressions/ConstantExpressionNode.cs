﻿using System;
using System.Collections.Generic;
using MetaCode.Compiler.AbstractSyntaxTree.Constants;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class ConstantExpressionNode : PrimaryExpressionNode
    {
        #region Public properties

        public ConstantLiteralNode Constant { get; set; }

        public Type Type { get { return Constant.Type; } }

        #endregion

        #region Constructors

        public ConstantExpressionNode(ConstantLiteralNode constant)
            : this(constant, new AttributeNode[0])
        {

        }

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