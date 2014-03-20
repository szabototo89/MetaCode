using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.AbstractTree.Factories;
using MetaCode.Compiler.Services;
using MetaCode.Core;

namespace MetaCode.Compiler.Visitors
{
    public partial class AbstractTreeVisitor
    {
        public CompilerService CompilerService { get; protected set; }
        public StatementFactory StatementFactory { get; protected set; }

        public ConstantLiteralFactory ConstantLiteralFactory { get; protected set; }

        public AbstractTreeVisitor(CompilerService compilerService)
        {
            if (compilerService == null)
                ThrowHelper.ThrowArgumentNullException(() => compilerService);

            CompilerService = compilerService;

            ConstantLiteralFactory = new ConstantLiteralFactory(CompilerService);
            StatementFactory = new StatementFactory(CompilerService);
        }
    }
}
