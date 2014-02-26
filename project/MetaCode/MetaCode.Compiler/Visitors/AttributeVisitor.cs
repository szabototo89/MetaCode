using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Mime;
using System.Text;
using System.Threading.Tasks;
using MetaCode.Compiler.Grammar;
using MetaCode.Core;

namespace MetaCode.Compiler.Visitors
{
    public class AttributeVisitor : MetaCodeBaseVisitor<string>
    {
        public override string VisitAttribute(MetaCodeParser.AttributeContext context)
        {
            Console.WriteLine("attribute: {0}", context.ATTRIBUTE_ID().With(id => id.GetText()));
            return base.VisitAttribute(context);
        }
    }
}
