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

        private INode ParseWithAbstractTreeVisitor(MetaCodeCompiler compiler, string source)
        {
            return compiler.ParseWithVisitor<INode, AbstractTreeVisitor>(source);
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
                "var apple = 13;",
                "var text = \"Hello World!\"",
                "var array = [1, 2, true]"
            );
            // WHEN
            var result = ParseWithAbstractTreeVisitor(Compiler, source);
            // THEN
        }
    }
}
