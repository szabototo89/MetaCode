using MetaCode.Core;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.Interpreter
{
    public class VariableContext
    {
        public string Name { get; protected set; }

        public object Value { get; set; }

        public VariableContext(string name, object value)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            Name = name;
            Value = value;
        }
    }
}
