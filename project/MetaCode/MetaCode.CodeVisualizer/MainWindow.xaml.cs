using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using MetaCode.CodeVisualizer.ViewModels;
using Microsoft.Win32;

namespace MetaCode.CodeVisualizer
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainViewModel ViewModel { get; set; }

        public MainWindow()
        {
            InitializeComponent();
            ViewModel = new MainViewModel();
            DataContext = ViewModel;
        }

        private void NewFileCommand(object sender, RoutedEventArgs e)
        {
            ViewModel.OriginalSourceCode = ViewModel.GeneratedSourceCode = string.Empty;
        }

        private void OpenFileCommand(object sender, RoutedEventArgs e)
        {
            var dialog = new OpenFileDialog() {
                Filter = "MetaCode files (*.mc)|*.mc|All files (*.*)|*.*",
                CheckFileExists = true
            };

            if (dialog.ShowDialog(this) == true) {
                var file = dialog.FileName;
                using (var text = File.OpenText(file)) {
                    ViewModel.OriginalSourceCode = text.ReadToEnd();
                }
            }
        }

        private void SaveFileCommand(object sender, RoutedEventArgs e)
        {
            SaveCodeToFileCommand(ViewModel.OriginalSourceCode);
        }

        private void SaveGeneratedFileCommand(object sender, RoutedEventArgs e)
        {
            SaveCodeToFileCommand(ViewModel.GeneratedSourceCode);
        }

        private void SaveCodeToFileCommand(string sourceCode)
        {
            var dialog = new SaveFileDialog() { Filter = "MetaCode files (*.mc)|*.mc|All files (*.*)|*.*", CheckFileExists = false };

            if (dialog.ShowDialog(this) == true) {
                var file = dialog.FileName;
                using (var text = File.CreateText(file)) {
                    text.WriteLine(sourceCode);
                }
            }
        }
    }
}
