@hello
object Test extends App {

  @Case class Person(val name: String, val age: Int)

  /*object Person {
    def apply(name: String, age: Int) = new Person(name, age)
    def unapply(obj: Person) : Option[(String, Int)] = Some(
      (obj.name, obj.age)
    )
  }*/

  val p : Person = Person("John Doe", 30)

  println(this.hello)

  p match {
    case Person(name : String, age : Int) => println(s"Name: $name ($age)")
  }
}