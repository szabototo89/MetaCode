namespace MetaCode.Compiler.AbstractTree.Operators.Relational
{
    public class InequalityOperatorNode : RelationalBinaryOperatorNode
    {
        public override string Operator
        {
            get { return "!="; }
        }
    }
}