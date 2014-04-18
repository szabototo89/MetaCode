namespace BooMacroDemo

import System
import Boo.Lang.Compiler
import Boo.Lang.Compiler.Ast
import Boo.Lang.Compiler.Ast.Visitors

macro checkNull:
	parameter = checkNull.Arguments[0]
	yield [|
		if ($(parameter) == null):
			message = string.Format("{0} cannot be null!", $(parameter.ToString()))
			raise ArgumentNullException(message, $(parameter.ToString()))
	|]

macro singleton:
	args = singleton.Arguments
	name = args[0]
	baseClass = args[1]
	yield [|
		static class $(name)($(baseClass)):
			private static _instance as $(baseClass) = $(baseClass)()
				
			public static def GetInstance() as $(baseClass):
				return $(name)._instance
	|]
	
macro singletonClass:
	args = singletonClass.Arguments
	name = args[0]
	body = singletonClass.Body
	yield [|
		class $(name):
			private static _instance as $(name) = $(name)()
			
			public static def GetInstance() as $(name):
				return $(name)._instance
				
			private def constructor():
				$(body)
	|]
	
class Person:
	public Name as string
	public Age as int	
	
	public def constructor():
		pass
		
	public def constructor(name as string, age as int):
		checkNull name
		
singleton PersonSingleton, Person

person = PersonSingleton.GetInstance()
person2 = PersonSingleton.GetInstance()

Console.WriteLine(person == person2)	// Kimenet: igaz

p = Person(null, 31)

singletonClass Employee:
	print "Hello World"

employee = Employee.GetInstance()

Console.ReadKey(true)