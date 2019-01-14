package scala.codeChallange

object EvenlyDivided {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val arr = new Array[String](n)
    for (arr_i <- 0 to n - 1) {
      arr(arr_i) = sc.useDelimiter("\n").next()
    }

    arr.toList.map {
      x =>
        println(x.toString.map(_.asDigit).filter(_ >= 0).toSet)
    }
  }
}
