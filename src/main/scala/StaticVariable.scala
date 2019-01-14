/**
  * Created by pati80 on 10/04/17.
  *
  * Increment current variable....
  */

object StaticVariable {
  private var current = 0
  private def inc = {current += 1; current}

  def main(args: Array[String]): Unit = {
    println(s"CUU $current")
    val ss = new StaticVariable
    ss.i
  }
}

class StaticVariable{
  val i = StaticVariable.inc
  println(s"CLASS $i")
}

/*
// Pizza class
class Pizza (var crustType: String) {
  override def toString = "Crust type is " + crustType
}

// companion object
object Pizza {
  val CRUST_TYPE_THIN = "thin"
  val CRUST_TYPE_THICK = "thick"
  def getFoo = "Foo"
}
*/


//It’s also important to know that a class and its companion object can access each other’s private members.
// In the following code, the “static” method double in the object can access the private variable secret of the class Foo:

/*class Foo {
  private val secret = 2
}

object Foo {
  // access the private class field 'secret'
  def double(foo: Foo) = foo.secret * 2
}

object Driver extends App {
  val f = new Foo
  println(Foo.double(f))  // prints 4
}*/
//Similarly, in the following code, the instance member printObj can access the private field obj of the object Foo:
/*

class Foo {
  // access the private object field 'obj'
  def printObj { println(s"I can see ${Foo.obj}") }
}

object Foo {
  private val obj = "Foo's object"
}

object Driver extends App {
  val f = new Foo
  f.printObj
}*/
