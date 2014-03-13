using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractTree;
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
            return compiler.ParseWithVisitor<Node, AbstractTreeVisitor>(source);
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
    }
}
