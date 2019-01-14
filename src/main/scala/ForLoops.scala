object ForLoops {
  def main(args: Array[String]) {
    /*val sc = new java.util.Scanner(System.in)
    var n = sc.nextInt()*/
    //val n = scala.io.StdIn.readInt()

    //No return type for for loop
    for (i <- 1 to 10){
      println(s"x $i = ${2*i}")
    }

    // For yield loop (Transform collection from one type to another)
    val a = List(2, 5, 1, 4, 8)
    val xx = for {
      e <- a
      s = println(s" E $e")
    } yield {
      println(s" yielddd $e")
      e
    }

    println(s"For yield $xx")
  }



}
