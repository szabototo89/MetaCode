namespace MetaCode.Compiler.AbstractSyntaxTree.Operators.Relational
{
    public class InequalityOperatorNode : RelationalBinaryOperatorNode
    {
        public override string Operator
        {
            get { return "!="; }
        }
    }
}