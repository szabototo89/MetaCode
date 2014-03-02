using System.Collections;
using System.Linq;
using MetaCode.Compiler.AbstractTree.Expressions;

namespace MetaCode.Compiler.AbstractTree.Constants
{
    public class ArrayConstantLiteralNode : ConstantLiteralNode<ExpressionNode[]>, IArrayConstantLiteralNode
    {
        #region Constructors

        public ArrayConstantLiteralNode(ExpressionNode[] values)
            : base(values, typeof(IEnumerable))
        {
            foreach (var node in values) {
                node.SetParent(this);
            }
            Children.AddRange(values);
        }

        #endregion

        #region IArrayConstantLiteralNode properties

        IExpressionNode[] IConstantLiteralNode<IExpressionNode[]>.Value
        {
            get { return Value.OfType<ExpressionNode>().ToArray(); }
        }

        #endregion
    }
}