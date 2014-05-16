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
                macro convertToWhile(tree : { * > foreach }) do
                   
                end;

                implicit macro inline(tree: { * > while[body] }) do
                    foreach (var t : any in tree) do
                       writeline(find(t, '{ if[condition] }'));
                    end;
                end;

                foreach (var i : Number in [1,2,3,4]) do
                    writeline(i);
                end;

                var i : number = 0;
                var n : number = 100;
                var sum : number = 0;

                while (i < n) do
                  sum := sum + 2 * i;
                  i := i + 1;
                end;

                while (false) do
                  var i : number = 1;
                end;

                if (24 > 42) 
                  skip;
                end;

                if (24 > 42) 
                  skip;
                end;

                if (24 > 42) 
                  skip;
                end;  
            ";

            var compilerService = new CompilerService();
            var analyzer = new MacroInterpreter(compilerService);

            // WHEN
            var node = ParseWithAbstractTreeVisitor(Compiler, source);
            analyzer.VisitChild(node as CompilationUnit);

            // THEN
        }

        [Test]
        public void InterpreterTest()
        {
            // GIVEN
            var source = @"
                var j : number = 0;
                foreach (var i : number in [1,2,3,4,5,6]) do
                  j = 3 * i;
                  writeline(j + '. Hello World!');
                end;
            ";

            var compilerService = new CompilerService();
            var analyzer = new CodeInterpreter(compilerService);

            // WHEN
            var node = ParseWithAbstractTreeVisitor(Compiler, source);
            analyzer.VisitChild(node as CompilationUnit);

            // THEN
        }
    }
}
