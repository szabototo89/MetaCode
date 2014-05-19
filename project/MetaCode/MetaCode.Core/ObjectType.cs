using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Core
{
    public class ObjectType
    {
        public string Type { get; set; }

        private readonly Dictionary<string, object> _members;

        public ObjectType()
        {
            _members = new Dictionary<string, object>();
        }

        public object this[string propertyName]
        {
            get
            {
                object result;
                _members.TryGetValue(propertyName, out result);
                return result;
            }
            set
            {
                if (_members.ContainsKey(propertyName))
                    _members[propertyName] = value;
                else 
                    _members.Add(propertyName, value);
            }
        }
    }
}
