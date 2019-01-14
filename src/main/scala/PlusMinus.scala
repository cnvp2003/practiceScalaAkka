
object PlusMinus {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    var arr = new Array[Int](n)
    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt()
    }
    println(arr.toList.filter( x => x > 0).size.toDouble / n)
    println(arr.toList.filter( x => x < 0).size.toDouble / n)
    println(arr.toList.filter( x => x == 0).size.toDouble / n)

    /*val n = readLine().toInt
    var arr = new Array[Int](n)
    for(arr_i <- 1 to n) yield {
      println(arr.toList.filter( x => x > 0).size.toDouble / n)
      println(arr.toList.filter( x => x < 0).size.toDouble / n)
      println(arr.toList.filter( x => x == 0).size.toDouble / n)
    }*/
  }
}