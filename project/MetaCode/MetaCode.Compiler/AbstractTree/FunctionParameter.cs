using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree
{
    public class FunctionParameter
    {
        public IEnumerable<AttributeNode> Attributes { get; internal set; }

        public Identifier Name { get; internal set; }   

        public TypeNameNode TypeName { get; internal set; }

        public FunctionParameter(Identifier name, TypeNameNode typeName, IEnumerable<AttributeNode> attributes)
        {
            if (name == null) throw new ArgumentNullException("name", "The name is ");
            if (typeName == null) throw new ArgumentNullException("typeName");

            Name = name;
            TypeName = typeName;
            Attributes = (attributes ?? new List<AttributeNode>()).ToList();
        }
    }
}
