using System.Collections.Generic;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class MacroCallExpressionNode : CallExpressionNodeBase<StatementNodeBase>
    {
        public MacroCallExpressionNode(string name, IEnumerable<StatementNodeBase> actualParameters)
            : base(name, actualParameters)
        {
        }
    }
}