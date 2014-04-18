package main.scala

import language.experimental.macros
import scala.reflect.macros.whitebox.Context

object Macros {
  import reflect.runtime.universe._

  def hello() = macro hello_impl

  def hello_impl(c: Context)() = {
    import c.universe._
    println("Hello World!")

    reify {
      println("Hello World!")
    }
  }

  def debug[T](param: T): T = macro debug_impl[T]

  def debug_impl[T : c.WeakTypeTag](c: Context)(param: c.Expr[T]) : c.Expr[T] = {
    import c.universe._

    val paramRep = show(param.tree)
    val paramRepTree = Literal(Constant(paramRep))
    val paramExpr = c.Expr[String](paramRepTree)

    reify {
      println(paramExpr.splice + " = " + param.splice)
      param.splice
    }
  }

  def assert(message: String)(condition: Boolean) = macro assert_impl

  def assert_impl(c: Context)(message: c.Expr[String])(condition: c.Expr[Boolean]) = {
    import c.universe._

    val conditionRepresentation = show(condition.tree)
    val conditionTree = Literal(Constant(conditionRepresentation))
    val conditionExpression = c.Expr[String](conditionTree)

    reify {
      if (!condition.splice)
        throw new AssertionError(message.splice + "(" + conditionExpression.splice + " == " + condition.splice + ")")
    }
  }
}
