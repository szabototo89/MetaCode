using System;
using System.Collections.Generic;
using System.Diagnostics;
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
    public class CodeGeneratorTestFixture : CompilerTestFixtureBase
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
        public void SimpleCodeTest()
        {
            // GIVEN
            var source = @"
                function max(a: number, b: number) : number do
                    while (a < b) do
                        skip;
                    end;
                end;

                a.b.c;
                toString('Hello World', 10);
                (10 + 5) * b;
                foreach (var str : string in ['Hello', 'World']) do
                    if (a > 10) 
                      if (true) writeline(str); end;
                    else
                      skip;
                    end;
                end;

                object Person
                    name: string;
                    age: number;
                end;

                attribute @not-null(id: string, id2: number);

                var b : number = 100;
            ";

            var analyzer = new CodeGenerator();

            // WHEN
            var node = ParseWithAbstractTreeVisitor(Compiler, source);
            var result = analyzer.VisitChild(node as CompilationUnit);

            // THEN
            Debug.WriteLine(result.ToString());
        }

        [Test]
        public void SimpleMacroTest()
        {
            // GIVEN
            var source = @"
                implicit macro helloMacro(tree: { * > foreach[body] }) do
                    writeline('Actual parameters of helloMacro');
                    writeline('-------------------');
                    var i : number = 1;
                    foreach (var str : string in convertToString(tree)) do
                        writeline(i + '. AST');
                        write(str);
                        writeline('-------------------');
                        i = i + 1;
                    end;
                end;                 

                function max(a: number, b: number) : number do
                    while (a < b) do
                        skip;
                    end;
                end;

                a.b.c;
                toString('Hello World', 10);
                (10 + 5) * b;
                foreach (var str : string in ['Hello', 'World']) do
                    if (a > 10) 
                      if (true) writeline(str); end;
                    else
                      skip;
                    end;
                end;

                foreach (var i : number in [1,2,3,4]) do
                    skip;
                end;

                object Person
                    name: string;
                    age: number;
                end;

                attribute @not-null(id: string, id2: number);

                var b : number = 100;
            ";

            var macroInterpreter = new MacroInterpreter(new CompilerService());
            var codeGenerator = new CodeGenerator();

            // WHEN
            var node = ParseWithAbstractTreeVisitor(Compiler, source);
            macroInterpreter.VisitChild(node as CompilationUnit);
            var result = codeGenerator.VisitChild(macroInterpreter.Root);

            // THEN
            Debug.WriteLine(result.ToString());
        }

    }
}
