using System;
using System.Collections;
using System.Linq;

namespace MetaCode.Compiler.AbstractTree
{
    public class ArrayConstantLiteralNode : ConstantLiteralNode<IExpressionNode[]>, IArrayConstantLiteralNode
    {
        #region Constructors

        public ArrayConstantLiteralNode(IExpressionNode[] value)
            : base(value, typeof(IEnumerable))
        {

        }

        #endregion
    }
}