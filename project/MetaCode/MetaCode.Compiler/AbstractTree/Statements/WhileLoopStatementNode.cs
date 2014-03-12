using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractTree.Expressions;

namespace MetaCode.Compiler.AbstractTree.Statements
{
    public class WhileLoopStatementNode : LoopStatementNode
    {
        public ExpressionNode Expression { get; set; }

        public WhileLoopStatementNode(ExpressionNode expression, BlockStatementNode body)
            : base(body)
        {
            if (expression == null) 
                throw new ArgumentNullException("expression", "The expression is null!");
            
            if (expression.Type == null)
                throw new Exception("The type of expression is null!");
            
            if (expression.Type != typeof(bool))
                throw new Exception("The type of expression is not System.Boolean!");

            Expression = expression;
        }
    }
}
