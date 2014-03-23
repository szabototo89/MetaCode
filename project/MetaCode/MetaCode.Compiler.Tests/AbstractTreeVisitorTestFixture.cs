using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractTree;
using MetaCode.Compiler.Services;
using MetaCode.Compiler.Visitors;
using NUnit.Framework;

namespace MetaCode.Compiler.Tests
{
    [TestFixture]
    public class AbstractTreeVisitorTestFixture : CompilerTestFixtureBase
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
        public void AbstractTreeVisitorVisitConstantShouldParseStringTest()
        {
            // GIVE in setup
            var source = MultiLine(
                "var array = abs(1dsg0)"
            );
            // WHEN
            var result = ParseWithAbstractTreeVisitor(Compiler, source);
            // THEN
        }

        [Test]
        public void AbstractTreeVisitorVisitStatementsTest()
        {
            // GIVE in setup
            var source = MultiLine(
                "do " +
                "   25;" +
                "end;"
            );

            var result = ParseWithAbstractTreeVisitor(Compiler, source);
        }

        [Test]
        public void AbstractTreeVisitorVisitWhileTest()
        {
            var source = MultiLine(
                "while (34) do",
                "   skip;",
                "end;"
            );

            var result = ParseWithAbstractTreeVisitor(Compiler, source);
            Console.WriteLine(CompilerService.Instance.Errors.Count);
        }

        [Test]
        public void AbstractTreeVisitorDeclareVariableTest()
        {
            var source = MultiLine(
                "var a : System.Boolean = false;",
                "do",
                "  var b = a;",
                "end;"
            );

            var result = ParseWithAbstractTreeVisitor(Compiler, source);
        }

    }
}
