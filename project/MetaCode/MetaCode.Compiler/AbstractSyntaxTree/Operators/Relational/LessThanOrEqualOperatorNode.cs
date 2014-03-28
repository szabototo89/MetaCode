namespace MetaCode.Compiler.AbstractSyntaxTree.Operators.Relational
{
    public class LessThanOrEqualOperatorNode : RelationalBinaryOperatorNode
    {
        public override string Operator
        {
            get { return "<="; }
        }
    }
}