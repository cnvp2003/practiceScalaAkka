package scala.codeChallange

object TreeHight {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val t = sc.nextInt()
    var a0 = 0

    val a = new Array[Int](t)

    for (a_i <- 0 to t - 1) {
      a(a_i) = sc.nextInt()
    }
    a.toList.map {
      x => var height = 1
        for (i <- 1 to x) {

        i match {
          case 0 => height
          case x if (x % 2 == 1) => {
            height *= 2
          }
          case x if (x % 2 == 0) => {
            height += 1
          }
        }
      }
        println(height)
    }
  }

  /*def main(args: Array[String]) {
    val n = readInt()
    (1 to n).foreach {
      _ =>
        val t = readInt()
        val r = (1 to t).foldLeft(1) {
          case (acc, cycle) => if(cycle % 2 == 1) acc * 2 else acc + 1
        }
        println(r)
    }
  }*/
}
