using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Compiler.Services
{
    public abstract class InformationBase
    {
        public string Message { get; protected set; }

        protected InformationBase(string message)
        {
            Message = message;
        }
    }

    public class ErrorInformation : InformationBase
    {
        public ErrorInformation(string message) 
            : base(message)
        {
        }
    }

    public class WarningInformation : InformationBase
    {
        public WarningInformation(string message) 
            : base(message)
        {
        }
    }
}
