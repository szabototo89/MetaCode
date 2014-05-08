using System;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Core;

namespace MetaCode.Compiler.Interpreter
{
    public class FunctionContext : FunctionContextBase
    {
        public FunctionDeclarationStatementNode Function { get; protected set; }
        public InterpreterContext InterpreterContext { get; protected set; }

        public FunctionContext(string name, FunctionDeclarationStatementNode function, InterpreterContext interpreterContext)
            : base(name)
        {
            if (function == null)
                ThrowHelper.ThrowArgumentNullException(() => function);

            if (interpreterContext == null)
                ThrowHelper.ThrowArgumentNullException(() => interpreterContext);

            Function = function;
            InterpreterContext = interpreterContext;
        }

        public override object Invoke(object[] parameters)
        {
            var scope = InterpreterContext.PushBlock();

            if (parameters.Length != Function.Parameters.Count())
                throw new Exception(string.Format("Invalid call of {0}!", Function.FunctionName));

            Function.Parameters.Foreach((parameter, index) =>
                scope.DeclareVariable(parameter.Name, parameters[index])
            );

            //InterpreterContext.

            InterpreterContext.PopBlock();

            throw new NotImplementedException();
        }
    }
}