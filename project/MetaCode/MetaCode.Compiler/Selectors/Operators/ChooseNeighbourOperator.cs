using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree;

namespace MetaCode.Compiler.Selectors.Operators
{
    public class ChooseNeighbourOperator : NodeSelectorOperator
    {
        public override IEnumerable<Node> Iterate(Node node, Func<Node, IEnumerable<Node>> func)
        {
            var children = node.Parent
                               .Children
                               .Where(child => child != node)
                               .ToArray();

            var result = new List<Node> { node };

            foreach (var child in children)
                result.AddRange(func(child));

            return result;
        }
    }

}
