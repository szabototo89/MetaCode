using System.Collections;
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
            foreach (var node in values) {
                node.SetParent(this);
            }
            _children.AddRange(values);
        }

        #endregion
    }
}