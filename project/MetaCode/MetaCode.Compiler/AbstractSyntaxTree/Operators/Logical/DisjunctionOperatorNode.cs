namespace MetaCode.Compiler.AbstractSyntaxTree.Operators.Logical
{
    public class DisjunctionOperatorNode : LogicalBinaryOperatorNode
    {
        public override string Operator
        {
            get { return "or"; }
        }
    }
}
