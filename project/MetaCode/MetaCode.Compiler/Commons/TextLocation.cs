using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.Commons
{
    public class TextLocation
    {
        public int Line { get; protected set; }

        public int Offset { get; protected set; }

        public TextLocation(int line, int offset)
        {
            Line = line;
            Offset = offset;
        }

        public override string ToString()
        {
            return string.Format("({0}:{1})", Line, Offset);
        }
    }
}
