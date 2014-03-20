using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Core
{
    public static class MonadExtensions
    {
        public static bool In<TValue, TArrayItem>(this TValue value, IEnumerable<TArrayItem> array)
            where TArrayItem : TValue
        {
            if (array == null) 
                throw new ArgumentNullException("array");

            return array.Any(item => EqualityComparer<TValue>.Default.Equals(value, item));
        }

        public static TValue Coalesce<TValue>(this TValue value, TValue defaultValue)
            where TValue : class
        {
            return value ?? defaultValue;
        }

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
