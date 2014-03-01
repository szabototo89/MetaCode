using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.Tests
{
    public abstract class CompilerTestFixtureBase
    {
        public string MultiLine(params string[] lines)
        {
            return string.Join(Environment.NewLine, lines);
        }
    }
}
