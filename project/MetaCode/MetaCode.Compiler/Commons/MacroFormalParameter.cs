using System;
using MetaCode.Compiler.Selectors;

namespace MetaCode.Compiler.Commons
{
    public class MacroFormalParameter
    {
        public string Name { get; protected set; }

        public string Selector { get; protected set; }

        public MacroFormalParameter(string name, string selector)
        {
            Name = name;
            Selector = selector;
        }
    }
}