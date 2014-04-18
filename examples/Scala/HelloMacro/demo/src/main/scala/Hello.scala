package main.scala

import main.scala.Macros._
import main.scala.MacroAnnotations.Identity

object Hello extends App {

  class Base

  hello()

  @Identity val x = debug(20)

  // assert("Cannot be negative!") (x - 50 > 0)

  println("mono: " + MacroBundles.Macros.mono)
  println("poly: " + MacroBundles.Macros.poly[String])
}
