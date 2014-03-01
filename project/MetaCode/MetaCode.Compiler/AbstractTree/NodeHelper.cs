using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractTree
{
    public static class NodeHelper
    {
        public static Node ToNode(this INode node)
        {
            return node as Node;
        }
    }
}
