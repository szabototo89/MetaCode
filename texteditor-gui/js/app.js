$(function() {
		var initEditor = function(id) {
			var editor = ace.edit(id)
			editor.setTheme("ace/theme/monokai")
			editor.getSession().setMode("ace/mode/javascript")
			return editor
		}

		initEditor("text-editor-left")
		initEditor("text-editor-right")
});

MetaCode.Compiler.AbstractSyntaxTree