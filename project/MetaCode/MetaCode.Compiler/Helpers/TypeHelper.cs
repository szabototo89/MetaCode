using System.Collections;
using MetaCode.Core;
using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Runtime.Remoting;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.Helpers
{
    public static class TypeHelper
    {
        public static bool IsEnumerable(this Type type)
        {
            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            if (type == typeof(IEnumerable))
                return true;

            return type.GetInterfaces()
                       .Any(@interface => @interface == typeof(IEnumerable));
        }

        public static Type FindBaseClass(this Type type, Type otherType)
        {
            if (type == null) throw new ArgumentNullException("type", "The type is null!");
            if (otherType == null) throw new ArgumentNullException("otherType", "The otherType is null!");

            var result = type.GetClassHierarchy()
                            .Intersect(otherType.GetClassHierarchy())
                            .FirstOrDefault(commonType => !commonType.IsInterface);

            return result ?? typeof(Object);
        }

        public static IEnumerable<Type> GetClassHierarchy(this Type type)
        {
            if (type == null) yield break;

            Type result = type;

            do
            {
                yield return result;
                result = result.BaseType;
            } while (result != null && !result.IsInterface);
        }
    }
}
