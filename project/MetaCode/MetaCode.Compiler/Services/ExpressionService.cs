using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Core;

namespace MetaCode.Compiler.Services
{
    public class ExpressionService
    {
        public static ExpressionService Instance
        {
            get { return Singleton<ExpressionService>.Instance; }
        }
    }
}
