/**
 * Created by pati80 on 6/5/16.
 */
object Staircase {

  def main (args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    for(i <- 1 to n) {
      val j = n-i
      for(i <- 1 to j) {
        print(s" ")
      }
      for(k <- 1 to i) {
        print(s"#")
      }
      println()
    }
  }
}