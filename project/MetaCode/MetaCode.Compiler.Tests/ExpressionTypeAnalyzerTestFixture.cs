using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.AbstractSyntaxTree.Visitors;
using MetaCode.Compiler.Services;
using MetaCode.Compiler.Visitors;
using NUnit.Framework;

namespace MetaCode.Compiler.Tests
{
    [TestFixture]
    class ExpressionTypeAnalyzerTestFixture : CompilerTestFixtureBase
    {
        private Node ParseWithAbstractTreeVisitor(MetaCodeCompiler compiler, string source)
        {
            return compiler.ParseWithVisitor<Node, AbstractTreeVisitor>(source, () => new AbstractTreeVisitor(CompilerService.Instance));
        }

        public MetaCodeCompiler Compiler { get; set; }

        [SetUp]
        public void Setup()
        {
            Compiler = new MetaCodeCompiler();
        }

        [Test]
        public void WrongAdditionTypeTest()
        {
            // GIVEN
            var source = MultiLine(
                "false + false;"
            );

            var compilerService = new CompilerService();
            var analyzer = new ExpressionTypeAnalyzer(compilerService);

            // WHEN
            var node = ParseWithAbstractTreeVisitor(Compiler, source);
            var type = analyzer.VisitChild(node);

            // THEN
            Assert.AreEqual(2, compilerService.Errors.Count);
        }
    }
}
