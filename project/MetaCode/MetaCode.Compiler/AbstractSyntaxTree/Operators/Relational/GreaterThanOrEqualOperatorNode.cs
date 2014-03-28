namespace MetaCode.Compiler.AbstractSyntaxTree.Operators.Relational
{
    public class GreaterThanOrEqualOperatorNode : RelationalBinaryOperatorNode
    {
        public override string Operator
        {
            get { return ">="; }
        }
    }
}