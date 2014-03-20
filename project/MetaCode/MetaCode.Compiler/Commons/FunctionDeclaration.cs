using System;
using MetaCode.Core;

namespace MetaCode.Compiler.Commons
{
    public class FunctionDeclaration
    {
        public Type[] FormalParameters { get; protected set; }

        public Type ReturnType { get; protected set; }

        public string Name { get; protected set; }


        public FunctionDeclaration(string name, Type returnType) 
            : this(name, returnType, new Type[0])
        {
        }

        public FunctionDeclaration(string name, Type returnType, Type[] formalParameters)
        {
            if (string.IsNullOrWhiteSpace(name))
                throw new ArgumentException("The name is blank!", "name");

            if (returnType == null)
                ThrowHelper.ThrowArgumentNullException(() => returnType);

            if (formalParameters == null)
                ThrowHelper.ThrowArgumentNullException(() => formalParameters);

            Name = name;
            ReturnType = returnType;
            FormalParameters = formalParameters;
        }
    }
}
