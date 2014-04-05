using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Constants;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.Services;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Factories
{
    public class ConstantLiteralFactory
    {
        public CompilerService CompilerService { get; protected set; }

        public ConstantLiteralFactory(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            CompilerService = compilerService;
            CompilerService.ConstantLiteralFactory = this;
        }

        public NumberConstantLiteralNode Number(double value)
        {
            return new NumberConstantLiteralNode(value);
        }

        public NumberConstantLiteralNode Number(string value)
        {
            double result;

            if (!Double.TryParse(value, NumberStyles.Any, CultureInfo.InvariantCulture, out  result))
                throw new InvalidCastException("Invalid number format!");

            return Number(result);
        }

        public BooleanConstantLiteralNode False()
        {
            return Logical(false);
        }

        public BooleanConstantLiteralNode True()
        {
            return Logical(true);
        }

        public BooleanConstantLiteralNode Logical(string value)
        {
            bool result;

            value = value.Trim();

            if (!value.In(new[] { "false", "true" }))
                throw new InvalidCastException("Invalid boolean format!");

            return Logical(value == "true");
        }

        public BooleanConstantLiteralNode Logical(bool value)
        {
            return new BooleanConstantLiteralNode(value);
        }

        public StringConstantLiteralNode String(string value)
        {
            if (value == null)
                ThrowHelper.ThrowArgumentNullException(() => value);

            return new StringConstantLiteralNode(value);
        }

        public ArrayConstantLiteralNode EmptyArray()
        {
            return new ArrayConstantLiteralNode(new ExpressionNode[0]);
        }

        public ArrayConstantLiteralNode Array(IEnumerable<ExpressionNode> items)
        {
            if (items == null)
                ThrowHelper.ThrowArgumentNullException(() => items);

            if (items.Any(item => item == null))
                ThrowHelper.ThrowException("An item of array is null!");

            return new ArrayConstantLiteralNode(items.ToArray());
        }

        public AttributeNode Attribute(string name, IEnumerable<ExpressionNode> expressions)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (expressions == null)
                ThrowHelper.ThrowArgumentNullException(() => expressions);

            return new AttributeNode(name, expressions);
        }

        // TODO: Create AppendTo function (like jQuery)
        /*public static TContent AppendTo<TContent, TNode>(this TContent content, TNode node)
            where TContent : Node
            where TNode : Node
        {
            return content;
        }*/
    }
}
