using MetaCode.Compiler.Commons;
using MetaCode.Core;
using System;
using System.CodeDom;
using System.Collections.Concurrent;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.AbstractSyntaxTree.Statements
{
    public enum MacroType { Implicit, Explicit }

    public class MacroDeclarationStatementNode : DeclarationStatementNodeBase
    {
        public MacroFormalParameterNode[] FormalParameters { get; protected set; }

        public BlockStatementNode Body { get; protected set; }
        
        public MacroType MacroType { get; protected set; }

        public MacroDeclarationStatementNode(string identifier, IEnumerable<MacroFormalParameterNode> formalParameters, BlockStatementNode body, MacroType macroType)
            : base(identifier)
        {
            if (body == null)
                ThrowHelper.ThrowArgumentNullException(() => body);

            if (formalParameters == null)
                ThrowHelper.ThrowArgumentNullException(() => formalParameters);

            if (body == null)
                ThrowHelper.ThrowArgumentNullException(() => body);

            FormalParameters = formalParameters.ToArray();
            Body = body;
            MacroType = macroType;

            AddChildren(Body);
        }
    }
}
