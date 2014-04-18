namespace BooMacroDemo

import System
import Boo.Lang.Compiler
import Boo.Lang.Compiler.Ast
import Boo.Lang.Compiler.Ast.Visitors

class WithMacro(AbstractAstMacro):
	
	class NameExpander(DepthFirstTransformer):
		_inst as ReferenceExpression
		
		
	
	override def Expand(macro as MacroStatement) as Statement:
		pass

