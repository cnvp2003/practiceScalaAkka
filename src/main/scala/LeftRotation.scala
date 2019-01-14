/**
  * Created by pati80 on 05/04/17.
  *
  * Problem: A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left.
  * For example, if left rotations are performed on array[1,2,3,4,5], then the array would become[3,4,5,1,2].
  *
  */

  object LeftRotation {

    def main(args: Array[String]) {
      val sc = new java.util.Scanner (System.in)
      var n = sc.nextInt
      var k = sc.nextInt
      var a = new Array[Int](n)
      for(a_i <- 0 to n-1) {
        a(a_i) = sc.nextInt
      }
      // Solution 1: Slower
      /*for(l <- 1 to k){
        for(i <- 0 until n ) {
          if(i+1 < n){
            val temp = a(i)
            a(i) = a(i+1)
            a(i+1) = temp
          }
        }
      }
      a.map(x=>print(s"$x "))*/

      // Solution 2: Fast
      val jj = if(k >= n) k-n else k
      val yy = a.splitAt(jj)
      val xx = yy._2 ++ yy._1
      xx.map(x=>print(s"$x "))
    }
  }

