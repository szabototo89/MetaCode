using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Resources;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Xml;
using ICSharpCode.AvalonEdit;
using ICSharpCode.AvalonEdit.Highlighting;
using ICSharpCode.AvalonEdit.Highlighting.Xshd;

namespace MetaCode.CodeVisualizer.Views
{
    public class MyTextEditor : TextEditor
    {
        public new string Text
        {
            get { return (string)GetValue(TextProperty); }
            set { SetValue(TextProperty, value); }
        }

        internal string baseText { get { return base.Text; } set { base.Text = value; } }

        public static DependencyProperty TextProperty =
        DependencyProperty.Register("Text", typeof(string), typeof(MyTextEditor),
        // binding changed callback: set value of underlying property
        new PropertyMetadata((obj, args) => {
            MyTextEditor target = (MyTextEditor)obj;
            if (target.baseText != (string)args.NewValue)    //avoid undo stack overflow
                target.baseText = (string)args.NewValue;
        })
        );

        protected override void OnTextChanged(EventArgs e)
        {
            SetCurrentValue(TextProperty, baseText);
            RaisePropertyChanged("Text");
            base.OnTextChanged(e);
        }

        public event PropertyChangedEventHandler PropertyChanged;
        public void RaisePropertyChanged(string info)
        {
            if (PropertyChanged != null) {
                PropertyChanged(this, new PropertyChangedEventArgs(info));
            }
        }

        public MyTextEditor()
        {
            InitializeSyntaxHighlighting();
        }

        private void InitializeSyntaxHighlighting()
        {
            var resource = new StringReader(CodeVisualizer.Resources.MetaCode);

            using (var reader = new XmlTextReader(resource)) {
                reader.Read();
                var xshd = HighlightingLoader.LoadXshd(reader);
                SyntaxHighlighting = HighlightingLoader.Load(xshd, HighlightingManager.Instance);
            }
        }
    }

}
