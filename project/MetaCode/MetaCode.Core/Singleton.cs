using System;
using System.Collections.Generic;
using System.Dynamic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Core
{
    public sealed class Singleton<TSingletonClass>
        where TSingletonClass : class, new()
    {
        private static TSingletonClass _instance;

        public static TSingletonClass Instance
        {
            get
            {
                if (_instance == null)
                    _instance = new TSingletonClass();

                return _instance;
            }
        }
        
    }
}
