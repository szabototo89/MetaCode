using System;
using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.Visitors;
using NUnit.Framework;

namespace MetaCode.Compiler.Tests
{
    [TestFixture]
    class MyVisitorCompilerTestFixture : CompilerTestFixtureBase
    {
        public MetaCodeCompiler Compiler { get; set; }

        [SetUp]
        public void Setup()
        {
            Compiler = new MetaCodeCompiler();
        }

        [Test]
        public void MyVisitorTest()
        {
            Compiler.Parse("var func = function(@optional number: @not-null Integer) : Integer do 35 end \n" +
                           "var a = 24");
        }

        [Test]
        public void MyVisitorTest2()
        {
            Compiler.Parse(
                MultiLine("var h = 10;",
                          "var abba = function() : Integer do 35 end")
            );
        }
    }
}
