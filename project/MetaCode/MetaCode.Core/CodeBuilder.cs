using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Core
{
    public class CodeBuilder
    {
        private readonly StringBuilder _builder;
        private int _indentationLevel;


        public CodeBuilder() : this(string.Empty)
        {

        }

        public CodeBuilder(string value)
        {
            _builder = new StringBuilder(value);
            _indentationLevel = 0;
        }

        public CodeBuilder Clear()
        {
            _builder.Clear();
            return this;
        }

        public CodeBuilder AppendLine()
        {
            return AppendLine("");
        }

        public CodeBuilder AppendLine(object value)
        {
            _builder
                .AppendLine(value.ToString());

            return this;
        }

        public CodeBuilder AppendFormat(string formatString, params object[] args)
        {
            _builder.AppendFormat(formatString, args);
            return this;
        }

        public CodeBuilder Append(object value)
        {
            _builder.Append(value);
            return this;
        }

        public CodeBuilder RaiseIndentation(int level = 1)
        {
            _indentationLevel += level;
            return this;
        }

        public CodeBuilder Do(Action func)
        {
            func();
            return this;
        }

        public CodeBuilder ReduceIndentation(int level = 1)
        {
            _indentationLevel = Math.Max(_indentationLevel - level, 0);
            return this;
        }

        public CodeBuilder ApplyIndentation()
        {
            _builder
                .Append(string.Join("", Enumerable.Range(0, _indentationLevel).Select(i => "  ")));
            return this;
        }

        public override string ToString()
        {
            return _builder.ToString();
        }

        public CodeBuilder AppendWithIndentation(object value)
        {
            _builder
                .Append(string.Join("", Enumerable.Range(0, _indentationLevel).Select(i => "  ")))
                .Append(value.ToString());
            return this;
        }
    }
}
