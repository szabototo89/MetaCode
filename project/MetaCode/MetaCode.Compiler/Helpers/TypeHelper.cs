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
        private static readonly Type[] NUMERIC_TYPES;

        static TypeHelper()
        {
            NUMERIC_TYPES = new[] { typeof(byte), typeof(short), 
                                    typeof(int), typeof(long), 
                                    typeof(float), typeof(double) };
        }

        public static bool IsLogical(this Type type)
        {
            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            return type == typeof(Boolean);
        }

        public static bool IsNumeric(this Type type)
        {
            if (type == null)
                ThrowHelper.ThrowArgumentNullException(() => type);

            return type.In(NUMERIC_TYPES);
        }

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

        public static Type GetItemType(this Type enumerable)
        {
            var enumerableType = enumerable.GetInterfaces()
                                            .Where(type => type.IsGenericType && type.GetGenericTypeDefinition() == typeof(IEnumerable<>))
                                            .Select(type => type.GenericTypeArguments[0])
                                            .FirstOrDefault();

            return enumerableType;
        }

        public static Type FindType(string typeName)
        {
            if (String.IsNullOrWhiteSpace(typeName))
                ThrowHelper.ThrowException("The typeName is blank!");

            return Type.GetType(typeName, false);
        }

        public static readonly object Void = new object();
    }
}
