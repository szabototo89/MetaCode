using System;
using System.Collections.Generic;
using System.Runtime.InteropServices.ComTypes;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree
{
    public class AttributeNode : Node
    {
        public string Name { get; protected set; }
        public IEnumerable<ExpressionNode> Expressions { get; protected set; }

        public AttributeNode(string name, IEnumerable<ExpressionNode> expressions)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (expressions == null)
                ThrowHelper.ThrowArgumentNullException(() => expressions);

            Name = name;
            Expressions = expressions;
        }
    }
}