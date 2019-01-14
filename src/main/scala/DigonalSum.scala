package scala.codeChallange

object DigonalSum {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var a = Array.ofDim[Int](n,n);
    var sum1 = 0
    var sum2 = 0
    for(a_i <- 0 to n-1) {
      for(a_j <- 0 to n-1){
        a(a_i)(a_j) = sc.nextInt();
        if (a_i == a_j){
          sum1 += a(a_i)(a_j)
        }
        if(a_i+ a_j == n-1){
          sum2 += a(a_i)(a_j)
        }

      }
    }
    println(if(sum1 > sum2) sum1 - sum2 else sum2 - sum1)
  }
}
