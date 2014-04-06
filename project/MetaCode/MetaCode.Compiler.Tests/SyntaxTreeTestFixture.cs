using System;
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
            Assert.IsInstanceOf<CompilationUnit>(result);
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
                "[1,2,3,4];",
                "1 to 10 by 32;",
            };

            // WHEN
            var results = sources.Select(source => ParseWithAbstractTreeVisitor(Compiler, source));

            // THEN
            foreach (var result in results) {
                Assert.IsInstanceOf<CompilationUnit>(result);
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
            Assert.IsInstanceOf<CompilationUnit>(result);
            Assert.NotNull(result.Children.First());
            Assert.IsInstanceOf<FunctionDeclarationStatementNode>(result.Children.First());
        }

        [Test]
        public void FunctionDeclarationWithAttributeTest()
        {
            // GIVEN
            var source =
                "@inline(true)" +
                "function max(a: number, b: number) : number do " +
                "  skip;" +
                "end;"
            ;

            // WHEN
            var result = ParseWithAbstractTreeVisitor(Compiler, source);

            // THEN
            Assert.IsInstanceOf<CompilationUnit>(result);
            Assert.NotNull(result.Children.First());
            Assert.IsInstanceOf<FunctionDeclarationStatementNode>(result.Children.First());
            var function = result.Children.First() as FunctionDeclarationStatementNode;
            CollectionAssert.IsNotEmpty(function.Attributes);
            var attribute = function.Attributes.First();
            Assert.AreEqual("@inline", attribute.Name);
            CollectionAssert.IsNotEmpty(attribute.Expressions);
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
            Assert.IsInstanceOf<CompilationUnit>(result);
            Assert.NotNull(result.Children.First());
            Assert.IsInstanceOf<FunctionDeclarationStatementNode>(result.Children.First());

            var expected = result.Children.First() as FunctionDeclarationStatementNode;
            Assert.AreEqual("void", expected.ReturnType.Type);
        }

        [Test]
        public void ObjectDeclarationTest()
        {
            // GIVEN
            var source =
                "object Point" +
                "  x: number;" +
                "  y: number;" +
                "end;"
            ;

            // WHEN
            var result = ParseWithAbstractTreeVisitor(Compiler, source);

            // THEN
            Assert.IsInstanceOf<CompilationUnit>(result);
            Assert.NotNull(result.Children.First());
            Assert.IsInstanceOf<ObjectDeclarationStatementNode>(result.Children.First());
        }

        [Test]
        public void AttributeDeclarationTest()
        {
            // GIVEN
            var source = "attribute @id(name: string);";

            // WHEN
            var result = ParseWithAbstractTreeVisitor(Compiler, source);

            // THEN
            Assert.IsInstanceOf<CompilationUnit>(result);
            Assert.NotNull(result.Children.First());
            Assert.IsInstanceOf<AttributeDeclarationStatementNode>(result.Children.First());
        }

        [Test]
        public void MemberExpressionTest()
        {
            // GIVEN
            var source = "Hello.World.Welcome.To.MetaCode;";

            // WHEN
            var result = ParseWithAbstractTreeVisitor(Compiler, source);

            // THEN
            Assert.IsInstanceOf<CompilationUnit>(result);
            Assert.NotNull(result.Children.First());
            Assert.IsInstanceOf<ExpressionStatementNode>(result.Children.First());
            var expression = (result.Children.First() as ExpressionStatementNode).Expression;
            Assert.IsInstanceOf<MemberExpressionNode>(expression);
        }

        [Test]
        public void MacroCallExpressionTest()
        {
            // GIVEN
            var source = "macro parallel(do skip; end, if (true) skip; end);";

            // WHEN
            var result = ParseWithAbstractTreeVisitor(Compiler, source);

            // THEN
            Assert.IsInstanceOf<CompilationUnit>(result);
            Assert.NotNull(result.Children.First());
            Assert.IsInstanceOf<ExpressionStatementNode>(result.Children.First());
            var macroCall = (result.Children.First() as ExpressionStatementNode).Expression as MacroCallExpressionNode;
            Assert.NotNull(macroCall);
            CollectionAssert.IsNotEmpty(macroCall.ActualParameters);
        }

        [Test]
        public void FunctionCallExpressionTest()
        {
            // GIVEN
            var source = "parallel(1, 2, true);";

            // WHEN
            var result = ParseWithAbstractTreeVisitor(Compiler, source);

            // THEN
            Assert.IsInstanceOf<CompilationUnit>(result);
            Assert.NotNull(result.Children.First());
            Assert.IsInstanceOf<ExpressionStatementNode>(result.Children.First());
            var functionCall = (result.Children.First() as ExpressionStatementNode).Expression as FunctionCallExpressionNode;
            Assert.NotNull(functionCall);
            Assert.AreEqual("parallel", functionCall.FunctionName.Name);
            CollectionAssert.IsNotEmpty(functionCall.ActualParameters);
        }
    }
}