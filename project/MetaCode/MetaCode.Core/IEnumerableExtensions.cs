using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Core
{
    public static class IEnumerableExtensions
    {
        public static IEnumerable<T> Foreach<T>(this IEnumerable<T> enumerable, Action<T> action)
        {
            return Foreach(enumerable, (value, index) => action(value));
        }

        public static IEnumerable<T> Foreach<T>(this IEnumerable<T> enumerable, Action<T, int> action)
        {
            if (enumerable == null)
                ThrowHelper.ThrowArgumentNullException(() => enumerable);

            if (action == null)
                ThrowHelper.ThrowArgumentNullException(() => action);

            int index = 0;
            var enumerator = enumerable.GetEnumerator();

            while (enumerator.MoveNext())
            {
                action(enumerator.Current, index);
                index++;
            }

            enumerator.Reset();

            return enumerable;
        }
    }
}
