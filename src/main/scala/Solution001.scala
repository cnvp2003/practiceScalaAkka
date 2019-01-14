package scala.codeChallange

import scala.collection.immutable.TreeSet
import scala.collection.mutable.ListBuffer

object Solution001 {

 /*   def main(args: Array[String]) {
      val input = io.Source.stdin.getLines().take(1).toString
      println(input)
      val inputList = io.Source.stdin.getLines().take(input.toInt).map(_.toInt).toList

      for (i <- (1 to inputList.size - 1 )) {
        println((1 to inputList(i)-1).toList.filter(x => x % 3 == 0 || x % 5 == 0).sum)
      }
    }*/
 /*def main(args: Array[String]) {
   val b = (1 to 9).toSet
   val aa = args.toSet diff b

  val sprted =  collection.immutable.SortedSet[Int]() ++ aa
   sprted.head

 }*/

  def main(args: Array[String]): Unit = {
  /*  val s = "SMS messages are really short"
    val k = 12

  //def solution001(s: String, k: Int): Int = {
    val aa: List[String] = s.grouped(k).toList
    aa.map(x=> println(s"x is  ${x.trim}"))*/
  var winter = new ListBuffer[Int]()
    //val aa = List(5, -2, 3, 8, 6)
    val aa = Array(5, -2, 3, 8, 6)
    //val aa = List(-5, -5, -5, -5, -42, 6, 12)

    aa.map { x =>
      winter match {
        case a:ListBuffer[Int] if(a.isEmpty)=> {
          println(s"for ${winter}")
          winter += x
        }
        case _:ListBuffer[Int] if(winter.contains(x)) => {
          println(s"DEEE ${winter}")
          winter += x
          println(s"DEEE after ${winter}")
        }
        case _:ListBuffer[Int] if(!(winter.filter(y => y > x)).toList.isEmpty) =>  {
          println(s"another  ${winter}")
          winter += x
          println(s"another  afterrr ${winter}")
        }
        case _ =>
      /*    winter += x
      .map { y =>
          if(x <= y)
            winter += x
        }*/
      }
      /*if(winter.isEmpty){
            winter += x
      }
      else{
        winter.map { y =>
          if(x <= y)
            winter += x
        }
      }*/
    }

    println(winter.size)

  }

}