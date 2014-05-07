using System;
using System.Collections.Generic;
using MetaCode.Compiler.AbstractSyntaxTree;

namespace MetaCode.Compiler.Selectors.Operators
{
    public abstract class NodeSelectorOperator
    {
        public abstract IEnumerable<Node> Iterate(Node node, Func<Node, IEnumerable<Node>> func);
    }
}