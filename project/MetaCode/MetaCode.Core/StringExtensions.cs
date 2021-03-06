﻿using System;
using System.Collections.Generic;
using System.Data.SqlTypes;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MetaCode.Core
{
    public static class StringExtensions
    {
        public static string NewLine(this string value, string text = "")
        {
            if (value == null)
                throw new ArgumentNullException("value");

            if (text == null)
                throw new ArgumentNullException("text");

            return value + Environment.NewLine + text;
        }

        public static StringBuilder AppendLine(this StringBuilder that, StringBuilder value)
        {
            return that.AppendLine(value.ToString());
        }

        public static CodeBuilder ToCodeBuilder(this string value)
        {
            return new CodeBuilder(value);
        }
    }
}
