﻿using MetaCode.Core;

namespace MetaCode.Compiler.Selectors
{
    public class NodeSelectorAttribute
    {
        public string Name { get; protected set; }

        public string Value { get; protected set; }

        public NodeSelectorAttribute(string name, string value)
        {
            if (string.IsNullOrWhiteSpace(name))
                ThrowHelper.ThrowException("The name is blank!");

            if (string.IsNullOrWhiteSpace(value))
                value = string.Empty;

            Name = name;
            Value = value;
        }
    }
}