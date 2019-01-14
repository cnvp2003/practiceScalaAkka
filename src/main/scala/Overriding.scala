/**
  * Created by pati80 on 25/11/2018.
  */

/*class Vehicle{
  var speed:Int = 60
}

class Bike extends Vehicle{
  var speed:Int = 100   //Error - variable speed needs 'override' modifier

  def show(){
    println(speed)
  }
}*/


/*class Vehicle{
  var speed:Int = 60
}

class Bike extends Vehicle{
  override var speed:Int = 100   //variable speed cannot override a mutable variable

  def show(){
    println(speed)
  }
}*/


/*class Vehicle{
  val speed:Int = 60
}

class Bike extends Vehicle{
   val speed:Int = 100   // //Error - variable speed needs 'override' modifier

  def show(){
    println(speed)
  }
}*/


class Vehicle{
  val speed:Int = 60
}

class Bike extends Vehicle{
  override val speed:Int = 100   // Override keyword (not var, it is val)

  def show(){
    println(speed)
  }
}


/*class Vehicle{
  val speed:Int = 60
}

class Bike extends Vehicle{
  override var speed:Int = 100   // Error - variable speed needs to be a stable, immutable value

  def show(){
    println(speed)
  }
}*/

object Overriding{
  def main(args:Array[String]){
    /*val c = new Vehicle
    c.speed = 121*/

    var b = new Bike()
    b.show()

    val w = new Wrapper(3)
    w.print()
  }
}

trait Printable extends Any {
  def print(): Unit = println(s"fdfd $this")
}
class Wrapper(val underlying: Int) extends AnyVal with Printable

