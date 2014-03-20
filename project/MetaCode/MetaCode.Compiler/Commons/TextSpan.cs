using System.Diagnostics;
using MetaCode.Core;

namespace MetaCode.Compiler.Commons
{
    public class TextSpan
    {
        public TextLocation Start { get; protected set; }

        public TextLocation End { get; protected set; }

        public TextSpan(TextLocation start, TextLocation end)
        {
            if (start == null)
                ThrowHelper.ThrowArgumentNullException(() => start);

            if (end == null)
                ThrowHelper.ThrowArgumentNullException(() => end);

            Start = start;
            End = end;
        }

        public override string ToString()
        {
            return string.Format("{0}..{1}", Start, End);
        }
    }
}