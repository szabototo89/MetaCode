using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;
using Microsoft.SqlServer.Server;

namespace MetaCode.Core
{
    public static class ThrowHelper
    {
        public static void ThrowArgumentNullException(string parameterName = "")
        {
            throw new ArgumentNullException(parameterName, !string.IsNullOrEmpty(parameterName)
                                                                ? "The '" + parameterName + "' is null!"
                                                                : string.Empty);
        }

        public static void ThrowArgumentNullException<TParameterType>(Expression<Func<TParameterType>> parameter)
        {
            var expression = ExpressionHelper.GetMemberInfo(parameter);
            var name = expression.Member.Name;
            throw new ArgumentNullException(name, "The '" + name + "' is null!");
        }
    }
}
