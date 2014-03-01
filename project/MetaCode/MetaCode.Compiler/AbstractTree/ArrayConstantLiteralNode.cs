using System;
using System.Collections;
using System.Linq;

namespace MetaCode.Compiler.AbstractTree
{
    public class ArrayConstantLiteralNode : ConstantLiteralNode<IExpressionNode[]>, IArrayConstantLiteralNode
    {
        #region Constructors

        public ArrayConstantLiteralNode(IExpressionNode[] values)
            : base(values, typeof(IEnumerable))
        {
            foreach (var node in values.OfType<Node>()) {
                node.SetParent(this);
            }
            Children.AddRange(values);
        }

        #endregion
    }
}