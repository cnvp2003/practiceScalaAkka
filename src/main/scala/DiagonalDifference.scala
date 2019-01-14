/**
 * Created by pati80 on 6/5/16.
 */

object DiagonalDifference {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var a = Array.ofDim[Int](n,n)
    var b = Array.ofDim[Int](n)
    var c = Array.ofDim[Int](n)
    for(a_i <- 0 to n-1) {
      for(a_j <- 0 to n-1){
        a(a_i)(a_j) = sc.nextInt()
        if(a_i == a_j){
          b(a_i) = a(a_i)(a_j)
        }
        if(a_j == (n-1-a_i)){
          c(a_i) = a(a_i)(a_j)
        }
      }
    }
    println(s"${math.abs(b.map(_.toInt).sum - c.map(_.toInt).sum)}")
  }
}
