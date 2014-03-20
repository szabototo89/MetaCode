using System;
using System.Collections.Generic;
using System.Globalization;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Schema;
using MetaCode.Compiler.AbstractTree.Constants;
using MetaCode.Compiler.AbstractTree.Expressions;
using MetaCode.Compiler.Services;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractTree.Factories
{
    public class ConstantLiteralFactory
    {
        public CompilerService CompilerService { get; protected set; }

        public ConstantLiteralFactory(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            CompilerService = compilerService;
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

        // TODO: Create AppentTo function (like jQuery)
        /*public static TContent AppendTo<TContent, TNode>(this TContent content, TNode node)
            where TContent : Node
            where TNode : Node
        {
            return content;
        }*/
    }
}
