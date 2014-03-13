using System.Collections;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.AbstractTree.Expressions;

namespace MetaCode.Compiler.AbstractTree.Constants
{
    public class ArrayConstantLiteralNode : ConstantLiteralNode<ExpressionNode[]>
    {
        #region Constructors

        public ArrayConstantLiteralNode(ExpressionNode[] values)
            : base(values, typeof(IEnumerable))
        {
            SetParentOfNodes(values);
        }

        #endregion

        public override IEnumerable<Node> Children
        {
            get { return base.Children.Concat(Value); }
        }
    }
}