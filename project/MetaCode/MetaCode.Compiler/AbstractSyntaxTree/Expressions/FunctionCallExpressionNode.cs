using System;
using System.Collections.Generic;
using System.Linq;
using MetaCode.Compiler.Commons;
using MetaCode.Core;

namespace MetaCode.Compiler.AbstractSyntaxTree.Expressions
{
    public class FunctionCallExpressionNode : ExpressionNode
    {
        public IEnumerable<ExpressionNode> ActualParameters { get; internal set; }

        public FunctionDeclaration FunctionDeclaration { get; internal set; }

        public FunctionCallExpressionNode(FunctionDeclaration functionDeclaration, IEnumerable<ExpressionNode> actualParameters)
        {
            if (functionDeclaration == null)
                ThrowHelper.ThrowArgumentNullException(() => functionDeclaration);

            if (actualParameters == null)
                ThrowHelper.ThrowArgumentNullException(() => actualParameters);

            FunctionDeclaration = functionDeclaration;
            ActualParameters = actualParameters ?? new List<ExpressionNode>();

            AddChildren(ActualParameters.OfType<Node>().ToArray());
        }

        public override Type Type
        {
            get { return FunctionDeclaration.ReturnType; }
        }
    }
}
