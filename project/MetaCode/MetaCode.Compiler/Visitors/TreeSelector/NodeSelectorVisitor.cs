using System;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.Commons.Declarations;
using MetaCode.Compiler.Grammar;
using MetaCode.Compiler.Selectors;
using MetaCode.Compiler.Selectors.Operators;

namespace MetaCode.Compiler.Visitors.TreeSelector
{
    public partial class NodeSelectorVisitor : TreeSelectorBaseVisitor<NodeSelector>
    {
        protected AttributeVisitor _AttributeVisitor { get; set; }

        protected readonly Dictionary<string, Func<NodeSelector>> _Selectors;

        protected readonly Dictionary<string, Func<NodeSelectorOperator>> _Operators;

        public NodeSelectorVisitor()
        {
            _AttributeVisitor = new AttributeVisitor();

            _Selectors = new Dictionary<string, Func<NodeSelector>>
            {
                { "*", () => new AnySelector() },
                { "if", () => new BranchingSelector() },
                { "foreach", () => new ForeachSelector() },
                { "while", () => new WhileSelector() },
                { "sequence", () => new SequenceSelector() },
                { "variable", () => new VariableDeclarationSelector() },
                { "function", () => new FunctionDeclarationSelector() },
                { "function-call", () => new FunctionCallSelector() },
            };

            _Operators = new Dictionary<string, Func<NodeSelectorOperator>>
            {
                { ">", () => new ChooseDirectChildOperator() },
                { "+", () => new ChooseNeighbourOperator() }
            };
        }

        public override NodeSelector VisitSelector(TreeSelectorParser.SelectorContext context)
        {
            var parent = context.Parent.Accept(this);

            if (context.Operator != null)
            {
                var op = context.Operator.Text;
                Func<NodeSelectorOperator> selectorOperator = null;
                if (!_Operators.TryGetValue(op, out selectorOperator))
                    throw new Exception("Invalid operator!");

                parent.Operator = selectorOperator();
            }
            else
                parent.Operator = new ChooseChildrenOperator();

            if (context.Child != null)
                parent.Child = context.Child.Accept(this);

            return parent;
        }

        public override NodeSelector VisitStatement(TreeSelectorParser.StatementContext context)
        {
            var selectorText = context.Selector.Text;

            var attributes = context.attribute()
                                    .Select(attribute => _AttributeVisitor.VisitAttribute(attribute))
                                    .ToArray();

            Func<NodeSelector> result;
            if (!_Selectors.TryGetValue(selectorText, out result))
                throw new Exception("Invalid selector!");

            var selector = result();
            selector.Attributes = attributes;

            return selector;
        }
    }

    public class TreeSelectorVisitor : TreeSelectorBaseVisitor<IEnumerable<NodeSelector>>
    {
        protected NodeSelectorVisitor _NodeSelectorVisitor { get; set; }

        public TreeSelectorVisitor()
        {
            _NodeSelectorVisitor = new NodeSelectorVisitor();
        }

        public override IEnumerable<NodeSelector> VisitInit(TreeSelectorParser.InitContext context)
        {
            return context.selectors().Accept(this);
        }

        public override IEnumerable<NodeSelector> VisitSelectors(TreeSelectorParser.SelectorsContext context)
        {
            return context
                    .selector()
                    .Select(selector => _NodeSelectorVisitor.VisitSelector(selector))
                    .ToArray();
        }
    }

    public class AttributeVisitor : TreeSelectorBaseVisitor<NodeSelectorAttribute>
    {
        public override NodeSelectorAttribute VisitAttribute(TreeSelectorParser.AttributeContext context)
        {
            var property = context.Property.Text;
            var value = string.Empty;

            if (context.Value != null)
                value = context.Value.Text;

            return new NodeSelectorAttribute(property, value);
        }
    }
}
