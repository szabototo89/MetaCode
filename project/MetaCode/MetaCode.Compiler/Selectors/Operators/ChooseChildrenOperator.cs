using System;
using System.Collections.Generic;
using MetaCode.Compiler.AbstractSyntaxTree;

namespace MetaCode.Compiler.Selectors.Operators
{
    public class ChooseChildrenOperator : NodeSelectorOperator
    {
        public override IEnumerable<Node> Iterate(Node node, Func<Node, IEnumerable<Node>> func)
        {
            var result = new List<Node>();

            foreach (var child in node.Children)
            {
                result.AddRange(func(child));
            }
            return result;            
        }
    }
}