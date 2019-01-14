
object Arrays {


  def main(args: Array[String]) {
    /*val n = scala.io.StdIn.readInt()

    val in = scala.io.StdIn.readLine()
    val myList = in.toList
    println(s"ss ${myList.reverse}")
  }*/

   /* val n = scala.io.StdIn.readInt()
    val in = scala.io.StdIn.readLine()
    println(s"${in.reverse}")*/

    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    val arr = new Array[Int](n)

    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt()
    }
    val aa = arr.toList
    aa.reverse.map { x =>
      print(s"${x}")
    }

  }
}