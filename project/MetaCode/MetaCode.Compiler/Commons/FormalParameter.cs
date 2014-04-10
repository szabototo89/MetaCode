using System;
using MetaCode.Compiler.Commons.Declarations;
using MetaCode.Core;

namespace MetaCode.Compiler.Commons
{
    public class FormalParameter
    {
        public string Name { get; set; }
        
        public Type Type { get; set; }

        public FormalParameter(string name, Type type)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The 'name' is blank!");

            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            Name = name;
            Type = type;
        }
    }
}