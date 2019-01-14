/*
import java.util.Scanner;

public class Test {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      System.out.println(sc.nextLine());
    }
  }
}
*/


import Array._


object Test {
  def main(args: Array[String]) {

    //List(1,2).map{ {_ => println("hi"); i= > i + 1}

    val list = List(1, 4, 2, 6, 8, 3, 5, 9)

    //println(list.groupBy(_ % 2))

    /* // Use an infinite loop.
    while (true) {

      // Read a line from the console window.
      val line: String = scala.io.StdIn.readLine()

      // Write the result string and a newline.
      printf("You typed: %s", line.reverse)
      println()
    }*/


  /*  val xs = List(("a", "b", "c"), ("d", "e", "f"),
      ("g", "h"), ("i", "j", "k"), ("g", "h", "fd", "df"))

   // val ys = for ((x, y, z) <- xs) yield x + y + z

//println(s"SS ${ys}")
    val zs = xs map {  x =>
      x match {
      case (x:String, y:String, z:String) => x + y + z
      }
    }

    println(s"SSzs ${zs}")*/
   // println(s"SSzs ${XY.X.value}")

   // println(s"${XY.X.value} ... ${XY.Y.value}")


    val cd = new abcddd
    cd.aa = "tet3453"
    cd.aa = "ffsdgdsf"

    println(s"${cd.aa} ...")
  }
}

//case class abcddd(val aa:String ="")
class abcddd{
  var aa:String =""
}





object XY {
  object X {
    val value: Int = 0
  }
  object Y {
    val value: Int = 0
  }
}