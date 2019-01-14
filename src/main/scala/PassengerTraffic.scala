package scala.codeChallange

import scala.util.Try

object PassengerTraffic {

  def getListOfValues(index: Int, list: List[Int], size: Int) = {
    val interval = size /12
    var sum = 0
    for(i <- 0 to interval -1 ) {
       sum += list(index * i + 12)
    }
    sum / interval
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var arr = new Array[String](n + 1);
    for (arr_i <- 0 to n) {
      arr(arr_i) = sc.nextLine();
    }

    val a = arr.flatMap{
      x =>
        val a = x.split("\\s+").take(2).toList
        val aa = a.map( x => Try(x.toInt)).filter(_.isSuccess).map(_.get)
        aa
    }

    for(i <- 0 to 11) {
      println(getListOfValues(i, a.toList, n))
    }
  }
}
