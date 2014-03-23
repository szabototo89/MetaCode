using MetaCode.Core;
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

        public TypeNameNode(Type type)
        {
            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            Type = type;
        }
    }
}
