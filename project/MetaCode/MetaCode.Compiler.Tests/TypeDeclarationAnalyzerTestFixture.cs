using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Visitors;
using MetaCode.Compiler.Services;
using MetaCode.Compiler.Visitors;
using NUnit.Framework;

namespace MetaCode.Compiler.Tests
{
    [TestFixture]
    class TypeDeclarationAnalyzerTestFixture : CompilerTestFixtureBase
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
        public void VariableDeclarationTest()
        {
            // GIVEN
            var source = @"
                function max(a: number, b: number): number do
                    function temp: number do skip; end; 
                    return temp();
                end;
                var a: number = 10 + 10;
                do  
                    var b: number = max(a + a, false);
                end;
            ";

            var compilerService = new CompilerService();
            var analyzer = new SemanticParserTreeVisitor(compilerService);

            // WHEN
            var node = ParseWithAbstractTreeVisitor(Compiler, source);
            analyzer.Visit(node as CompilationUnit);

            // THEN
            Assert.NotNull(compilerService.FindVariable("a"));
            Assert.AreEqual(0, compilerService.Errors.Count);
            Assert.AreEqual(0, compilerService.Warnings.Count);
        }

        [Test]
        public void MacroDeclarationTest()
        {
            // GIVEN
            var source = @"
                implicit macro inline(tree: { if > body }, tree2: { * }) do
                    writeline('Hello World!');
                    var a : array = [1, 2, 3, 4];

                    foreach (var value : number in [12 + 8, 3, 4, 5]) do
                        writeline(value);
                    end;

                    var index : number = 0;
                    writeline('Testing while statement ...');

                    while (index < 5) do
                        index = index + 1;
                    end;
                    writeline('done');
                    /*if (not ((50 + 4) > 10))
                        var c : number = a * a;
                        writeline(false);
                        skip;   
                    else 
                        writeline(10 + a);
                    end;*/
                end;
            ";

            var compilerService = new CompilerService();
            var analyzer = new MacroInterpreter(compilerService);

            // WHEN
            var node = ParseWithAbstractTreeVisitor(Compiler, source);
            analyzer.VisitChild(node as CompilationUnit);

            // THEN
        }
    }
}
