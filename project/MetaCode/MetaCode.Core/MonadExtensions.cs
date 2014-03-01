using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Core
{
    public static class MonadExtensions
    {
        public static TResult As<TResult>(this object value)
            where TResult : class
        {
            return value as TResult;
        }

        public static TResult Cast<TResult>(this object value)
        {
            if (value is TResult)
                return (TResult)value;
            throw new InvalidCastException(string.Format("Cannot cast to {0}!", typeof(TResult).FullName));
        }

        public static TResult With<TValue, TResult>(this TValue item, Func<TValue, TResult> selector)
            where TValue : class
        {
            if (selector == null)
                throw new ArgumentNullException("selector");

            if (item != null)
                return selector(item);

            return default(TResult);
        }
    }
}
