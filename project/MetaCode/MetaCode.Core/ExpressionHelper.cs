using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Core
{
    public static class ExpressionHelper
    {
        public static MemberExpression GetMemberInfo(Expression method)
        {
            LambdaExpression lambda = method as LambdaExpression;
            if (lambda == null)
                throw new ArgumentNullException("method");

            MemberExpression memberExpr = null;

            if (lambda.Body.NodeType == ExpressionType.Convert) {
                memberExpr =
                    ((UnaryExpression)lambda.Body).Operand as MemberExpression;
            }
            else if (lambda.Body.NodeType == ExpressionType.MemberAccess) {
                memberExpr = lambda.Body as MemberExpression;
            }

            if (memberExpr == null)
                throw new ArgumentNullException("method");

            return memberExpr;
        }
    }
}
