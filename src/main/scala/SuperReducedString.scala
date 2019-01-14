package scala.codeChallange

import java.util.Scanner

object SuperReducedString {
  def main(args: Array[String]) {
    val sc = new Scanner(System.in)
    val t = sc.next()
    val b = t.split("")

    removeAdjsentIfSame(b)

    /*val mapOfChar = b.groupBy(identity).mapValues(_.size)
    val result = mapOfChar.map { x => x match {
      case (key, value)  =>if(value % 2 != 0) key else ""
      }
    }*/

    val a = b.toList.filter(_ != null)

    if(a.size >0)
      a.map(print)
    else
      print("Empty String")
  }

  def removeAdjsentIfSame(b: Array[String]) {
    for (i <- 0 to b.size - 1) {
      if (i < b.size - 1) {
        if (b(i) == b(i + 1)) {
          b(i) = null
          b(i + 1) = null
        }
      }
    }
  }
}
