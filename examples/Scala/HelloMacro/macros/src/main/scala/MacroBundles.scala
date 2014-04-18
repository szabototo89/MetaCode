package main.scala

object MacroBundles {

  import scala.reflect.macros.blackbox.Context
  import scala.language.experimental.macros

  class Implementation(val c: Context) {
    def mono = c.literalUnit
    def poly[T: c.WeakTypeTag] = c.literal(c.weakTypeOf[T].toString)
  }

  object Macros {
    def mono =  macro Implementation.mono
    def poly[T] = macro Implementation.poly[T]
  }

}
