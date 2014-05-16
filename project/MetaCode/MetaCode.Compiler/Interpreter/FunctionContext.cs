using System;
using System.Linq;
using MetaCode.Compiler.AbstractSyntaxTree;
using MetaCode.Compiler.AbstractSyntaxTree.Statements;
using MetaCode.Compiler.AbstractSyntaxTree.Visitors;
using MetaCode.Core;

namespace MetaCode.Compiler.Interpreter
{
    public class FunctionContext : FunctionContextBase
    {
        public FunctionDeclarationStatementNode Function { get; protected set; }
        public InterpreterContext InterpreterContext { get; protected set; }
        public CodeInterpreter CodeInterpreter { get; protected set; }

        public FunctionContext(string name, FunctionDeclarationStatementNode function, InterpreterContext interpreterContext, CodeInterpreter codeInterpreter)
            : base(name)
        {
            if (function == null)
                ThrowHelper.ThrowArgumentNullException(() => function);

            if (interpreterContext == null)
                ThrowHelper.ThrowArgumentNullException(() => interpreterContext);

            if (codeInterpreter == null)
                ThrowHelper.ThrowArgumentNullException(() => codeInterpreter);

            Function = function;
            InterpreterContext = interpreterContext;
            CodeInterpreter = codeInterpreter;
        }

        public override object Invoke(object[] parameters)
        {
            var scope = InterpreterContext.PushBlock();

            if (parameters.Length != Function.Parameters.Count())
                throw new Exception(string.Format("Invalid call of {0}!", Function.FunctionName));

            Function.Parameters.Foreach((parameter, index) =>
                scope.DeclareVariable(parameter.Name, parameters[index])
            );

            scope.DeclareVariable("result");

            CodeInterpreter.VisitChild(Function.FunctionBody);

            var result = scope.GetValueOfVariable("result");

            InterpreterContext.PopBlock();

            return result;
        }
    }
}