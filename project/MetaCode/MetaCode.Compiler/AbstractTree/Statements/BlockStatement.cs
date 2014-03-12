using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree.Statements
{
    public class BlockStatement : StatementNode
    {
        public List<StatementNode> Statements
        {
            get { return Children.OfType<StatementNode>().ToList(); }
        }
    }
}
