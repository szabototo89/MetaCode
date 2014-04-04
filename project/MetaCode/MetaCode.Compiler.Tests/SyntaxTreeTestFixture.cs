using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Constants;
using MetaCode.Compiler.AbstractSyntaxTree.Expressions;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.Grammar;
using MetaCode.Compiler.Services;
using MetaCode.Compiler.Visitors;
using NUnit.Framework;

namespace MetaCode.Compiler.Tests
{
    [TestFixture]
    public class SyntaxTreeTestFixture : CompilerTestFixtureBase
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
        public void BlockTest()
        {
            // GIVEN
            var source = MultiLine(
                "do",
                "   skip;",
                "end;"
            );

            // WHEN
            var result = ParseWithAbstractTreeVisitor(Compiler, source);

            // THEN
            Assert.IsInstanceOf<BlockStatementNode>(result);
            Assert.NotNull(result.Children.First());
            Assert.IsInstanceOf<BlockStatementNode>(result.Children.First());
            Assert.IsInstanceOf<SkipStatementNode>(result.Children.First().Children.First());
        }

        [Test]
        public void ConstantTest()
        {
            // GIVEN
            var sources = new[] {
                "10;",
                "false;",
                "\"Hello World\";",
                "[];",
                "[1,2,3,4]",
                "1 to 10 by 32",
            };

            // WHEN
            var results = sources.Select(source => ParseWithAbstractTreeVisitor(Compiler, source));

            // THEN
            foreach (var result in results) {
                Assert.IsInstanceOf<BlockStatementNode>(result);
                Assert.NotNull(result.Children.First());
                Assert.IsInstanceOf<ExpressionStatementNode>(result.Children.First());
            }
        }

        [Test]
        public void FunctionDeclarationTest()
        {
            // GIVEN
            var source =
                "function max(a: number, b: number) : number do " +
                "  skip;" +
                "end;"
            ;

            // WHEN
            var result = ParseWithAbstractTreeVisitor(Compiler, source);

            // THEN
            Assert.IsInstanceOf<BlockStatementNode>(result);
            Assert.NotNull(result.Children.First());
            Assert.IsInstanceOf<FunctionDeclarationStatementNode>(result.Children.First());
        }

        [Test]
        public void ProcedureDeclarationTest()
        {
            // GIVEN
            var source =
                "function max(a: number, b: number) do " +
                "  skip;" +
                "end;"
            ;

            // WHEN
            var result = ParseWithAbstractTreeVisitor(Compiler, source);

            // THEN
            Assert.IsInstanceOf<BlockStatementNode>(result);
            Assert.NotNull(result.Children.First());
            Assert.IsInstanceOf<FunctionDeclarationStatementNode>(result.Children.First());

            var expected = result.Children.First() as FunctionDeclarationStatementNode;
            Assert.AreEqual("void", expected.ReturnType.Type);
        }
    }
}