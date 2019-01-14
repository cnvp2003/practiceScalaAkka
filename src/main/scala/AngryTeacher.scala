package scala.codeChallange

object AngryTeacher {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var t = sc.nextInt()
    var a0 = 0
    while(a0 < t){
      val n = sc.nextInt()
      val k = sc.nextInt()
      val a = new Array[Int](n)
      for(a_i <- 0 to n-1) {
        a(a_i) = sc.nextInt()
      }
      val count = a.toList.filter(_ <= 0).size
      if(count >= k)
        println("NO")
      else println("YES")
      a0+=1
    }
  }
}