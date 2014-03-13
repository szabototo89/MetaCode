using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractTree
{
    public class TypeNameNode : Node
    {
        public Type Type { get; protected set; }

        public string TypeName { get; protected set; }

        public TypeNameNode(string typeName)
        {
            if (string.IsNullOrWhiteSpace(typeName)) 
                throw new ArgumentException("The typeName is blank!", "typeName");

            TypeName = typeName;
        }
    }
}
