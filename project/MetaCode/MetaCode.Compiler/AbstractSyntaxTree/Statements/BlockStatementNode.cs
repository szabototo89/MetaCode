using System;
using System.Collections.Generic;
using System.IO.Pipes;
using System.Linq;
using MetaCode.Compiler.Commons;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public class BlockStatementNode : StatementNodeBase, ISupportAttributes
    {
        public List<StatementNodeBase> Statements { get; protected set; }

        public List<AttributeNode> Attributes { get; protected set; }

        public Scope Scope { get; protected set; }

        public BlockStatementNode(IEnumerable<StatementNodeBase> statements, IEnumerable<AttributeNode> attributes)
        {
            if (statements == null)
                ThrowHelper.ThrowArgumentNullException(() => statements);

            if (attributes == null)
                ThrowHelper.ThrowArgumentNullException(() => attributes);

            Statements = statements.ToList();
            Attributes = attributes.ToList();

            AddChildren(Statements);
            AddChildren(Attributes);
        }

        public Node AppendStatement(params StatementNodeBase[] statements)
        {
            if (statements == null)
                throw new ArgumentNullException("statements");
            AddChildren((Node[])statements);
            Statements.AddRange(statements);
            return this;
        }

        public Node PrependStatement(StatementNodeBase[] statements)
        {
            if (statements == null) throw new ArgumentNullException("statements");

            InsertChildren(0, statements);
            Statements.InsertRange(0, statements);

            return this;
        }

        public override Node DetachChild(Node node)
        {
            if (node is StatementNodeBase)
                Statements.Remove(node as StatementNodeBase);
            base.DetachChild(node);

            if (!Statements.Any())
                AppendStatement(new SkipStatementNode());

            return this;
        }

        public Node ClearChildren()
        {
            foreach (var child in _children)
                child.SetParent(null);
            _children.Clear();

            return this;
        }
    }
}
