import java.util
import scala.reflect.macros.whitebox.Context
import scala.language.experimental.macros
import scala.annotation.StaticAnnotation

object helloMacro {
  def impl(c: Context)(annottees: c.Expr[Any]*): c.Expr[Any] = {
    import c.universe._
    import Flag._
    val result = {
      annottees.map(_.tree).toList match {
        case q"object $name extends ..$parents { ..$body }" :: Nil =>
          q"""
            object $name extends ..$parents {
              def hello: ${typeOf[String]} = "Hello Scala Macro!"
              ..$body
            }
          """
      }
    }
    c.Expr[Any](result)
  }
}

object CaseClassMacro {
  // a makró implementációja
  def implementation(c: Context)(annottees: c.Expr[Any]*): c.Expr[Any] = {
    // betöltjük a kontextus univerzumát
    import c.universe._

    // lekérjük az annotált objektumokat egyenként
    annottees.map(_.tree).toList match {
      // mintaillesztéssel kiválogatjuk azokat az eseteket,
      // amikor egy osztályt jelöltünk meg az annotációnkkal
      case q"class $name(..$params) extends ..$parents { ..$body }" :: Nil => {
        // lekérjük az osztály nevét
        val termName : TermName = name.toTermName
        // kinyerjük az elsődleges konstruktor formális paramétereinek a nevét
        val parameterNames = params.map(param => param.name)
        // lekérdezzük az elsődleges konstruktor formális paramétereinek a típusát
        val parameterTypes = params.map((param : ValDef) => param.tpt)
        //
        val selections = parameterNames.map((param: TermName) => Select(Ident(newTermName("obj")), param))
        // végül elkészítjük az absztrakt szintaxisfát (AST), amivel majd visszatérünk
        // az AST-t quasiquote segítségével készítjük el
        val tree = q"""
          // az eredeti osztályt is legeneráljuk azzal a különbséggel,
          // hogy az elsődleges konstruktor láthatóságát protected-re állítjuk
          class $name protected (..$params) extends ..$parents { ..$body }

          // majd elkészítjük hozzá az extractor object-umot
          object $termName {
            // így mostmár mint case class-t lehet példányosítani
            def apply(..$params) = new $name(..$parameterNames)

            // a mintaillesztéshez szükséges unapply függvényt is legeneráljuk
            def unapply(obj: $name) : Option[(..$parameterTypes)] = Some((..$selections))
          }
        """
        // visszatérünk a legenerált fával
        c.Expr[Any](tree)
      }
      case _ => {
        // ha a felhasználó rossz helyen használta az annotációt,
        // akkor fordítási hibát dobunk
        c.error(c.enclosingPosition, "Unsupported expression!")

        // egy üres fával térünk vissza
        c.Expr[Any](EmptyTree)
      }
    }
  }
}

class hello extends StaticAnnotation {
  def macroTransform(annottees: Any*) = macro helloMacro.impl
}

// definiáljuk az annotációt
class Case extends StaticAnnotation {
  def macroTransform(annottees: Any*) = macro CaseClassMacro.implementation
}