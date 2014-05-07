using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.Services;
using MetaCode.Compiler.Visitors;
using NUnit.Framework;

namespace MetaCode.Compiler.Tests
{
    [TestFixture]
    public class TreeSelectorTestFixture
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
        public void StatementTest()
        {
            // GIVEN
            var underTest = new TreeSelectorCompiler();
            var selectorDefinition = @"
                [ * > if > sequence > variable[name = c] + while[condition] > *]
            ";

            var source = @"
                if (not ((50 + 4) > 10))
                  var c : number = a * a;
                  while (true) do
                    var d : number = a * a;
                    skip;
                  end;
                  writeline(false);
                  skip;   
                else 
                  writeline(10 + a);
                end;
            ";

            // WHEN
            var selectors = underTest.Parse(selectorDefinition);
            var tree = ParseWithAbstractTreeVisitor(Compiler, source);

            foreach (var selector in selectors)
            {
                var result = selector.SelectNode(tree);
            }

            // THEN
            Assert.AreEqual(1, selectors.Count());
        }
    }
}
