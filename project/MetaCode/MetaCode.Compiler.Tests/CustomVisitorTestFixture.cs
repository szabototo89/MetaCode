using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Globalization;
using System.Linq;
using System.Linq.Expressions;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Constants;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.AbstractSyntaxTree.Visitors;
using MetaCode.Compiler.Services;
using MetaCode.Compiler.Visitors;
using NUnit.Framework;

namespace MetaCode.Compiler.Tests
{
    [TestFixture]
    public class CustomVisitorTestFixture : CompilerTestFixtureBase
    {
        #region Helper methods

        private Node ParseWithAbstractTreeVisitor(MetaCodeCompiler compiler, string source)
        {
            return compiler.ParseWithVisitor<Node, AbstractTreeVisitor>(source, () => new AbstractTreeVisitor(CompilerService.Instance));
        }

        #endregion

        public MetaCodeCompiler Compiler { get; set; }

        [SetUp]
        public void SetUp()
        {
            Compiler = new MetaCodeCompiler();
        }

        [Test]
        public void CustomVisitorTest()
        {
            var source = MultiLine(
               "var a = function(c: System.Int32): System.Void do" +
               " var b = 45; " +
               " if (b == 10)" +
               "    skip;" +
               " end;" +
               "end;"
           );

            var result = ParseWithAbstractTreeVisitor(Compiler, source);
            var text = new StringBuilder();
            var visitor = new TreeVisitorBase<object>();
            visitor
                .Clear()
                .If<BinaryExpressionNode>((_visitor, node) =>
                {
                    _visitor.VisitChild(node.Left);
                    text.Append(" " + node.Operator.Operator + " ");
                    _visitor.VisitChild(node.Right);
                    var op = node.Operator.Operator;
                    return null;
                })
                .If<VariableDeclarationStatementNode>((_visitor, node) => _visitor.VisitChild(node.InitialValue))
                .If<BlockStatementNode>((_visitor, node) => text.Append(string.Join(Environment.NewLine, node.Statements.Select(_visitor.VisitChild))))
                .If<NumberConstantLiteralNode>((_visitor, node) => text.Append(node.Value.ToString(CultureInfo.InvariantCulture)))
                .VisitChild(result);

            text.Clear().AppendLine("digraph {");
            var nodes = new List<Tuple<string, string>>();
            visitor.Clear()
                .DefaultVisitor((_visitor, node) =>
                {
                    var name = "node" + nodes.Count;
                    var type = node.GetType().Name.First().ToString();
                    nodes.Add(Tuple.Create(name, type));

                    if (!node.Children.Any())
                        text.Append(name + ";");

                    foreach (var child in node.Children)
                    {
                        text.Append(name + "->");
                        _visitor.VisitChild(child);
                    }

                    return null;
                })
                .VisitChild(result);
            text.AppendLine();
            foreach (var tuple in nodes)
                text.AppendLine(string.Format("{0} [label=\"{1}\"];", tuple.Item1, tuple.Item2));
            var dot = text.AppendLine("}").ToString();
        }

        [Test]
        public void CustomVisitorGraphConverterTest()
        {
            var source = MultiLine(
               "var a = function(c: System.Int32): System.Void do" +
               " var b = 45; " +
               " if (b == 10)" +
               "    skip;" +
               " end;" +
               "end;"
           );

            var result = ParseWithAbstractTreeVisitor(Compiler, source);
            var text = new StringBuilder();
            var visitor = new TreeVisitorBase<string>();
            var nodes = new List<Tuple<string, string>>();
            var edges = new List<Tuple<string,string>>();
            visitor
                .Clear()
                .DefaultVisitor((_visitor, node) =>
                {
                    var name = "node" + nodes.Count;
                    var type = node.GetType().Name;
                    nodes.Add(Tuple.Create(name, type));

                    foreach (var child in node.Children)
                    {
                        var childName = _visitor.VisitChild(child);
                        edges.Add(Tuple.Create(name, childName));
                    }

                    return name;
                })
                .VisitChild(result);

            foreach (var node in nodes)
                text.AppendLine(string.Format("g.addNode(\"{0}\", {{ label: \"{1}\" }});", node.Item1, node.Item2));

            foreach (var edge in edges)
                text.AppendLine(string.Format("g.addEdge(\"{0}\", \"{1}\");", edge.Item1, edge.Item2));

            var js = text.ToString();

        }
    }
}
