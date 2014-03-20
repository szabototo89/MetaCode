using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.Helpers;
using NUnit.Framework;
using System.Collections.ObjectModel;

namespace MetaCode.Compiler.Tests
{
    [TestFixture]
    public class TypeHelperTestFixture
    {
        class DummyEnumerable : IEnumerable
        {
            public IEnumerator GetEnumerator()
            {
                throw new NotImplementedException();
            }
        }

        class DummyCollection : DummyEnumerable { }

        [Test]
        public void TypeHelperIsEnumerableShouldReturnTrueTest()
        {
            // GIVEN
            var underTest = new[] {
                typeof(Array),
                typeof(IEnumerable),
                typeof(IEnumerable<>),
                typeof(int[]),
                typeof(List<>),
                typeof(Collection<>),
                typeof(DummyCollection)
            };

            // WHEN
            var result = underTest.Select(type => type.IsEnumerable());

            // THEN
            Assert.IsTrue(result.All(value => value));
        }

    }
}
