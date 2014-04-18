package main.scala

import scala.reflect.macros.blackbox.Context
import scala.language.experimental.macros
import scala.annotation.StaticAnnotation

object MacroAnnotations {
  class Identity extends StaticAnnotation {
    def macroTransform(annottees: Any*) = macro IdentityMacro.impl
  }

  private object IdentityMacro {
    def impl(c: Context)(annottees: c.Expr[Any]*): c.Expr[Any] = {
      import c.universe._
      val inputs = annottees.map(a => a.tree).toList
      val (annottee, expandees) = inputs match {
        case (param: ValDef) :: (rest @ (_ :: _)) => (param, rest)
        case (param: TypeDef) :: (rest @ (_ :: _)) => (param, rest)
        case _ => (EmptyTree, inputs)
      }

      println(annottee, expandees)
      val outputs = expandees
      c.Expr[Any](Block(outputs, Literal(Constant())))
    }
  }
}