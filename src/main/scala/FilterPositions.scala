/**
  * For a given list with n integers, return a new list removing the elements at odd positions.
  * The input and output portions will be handled automatically.
  * You need to write a function with the recommended method signature.
  *
  * Input Format
  * integers contained in the list, each on a separate line.
  *
  * Output Format
  * Output the list with the integers at odd positions removed i.e. the first element, the third element and so on.
  * The relative positions of the remaining even-position elements should be the same as they were in the original array.
  * Each integer will be on a separate line.
  */

object FilterPositions {


  def f(arr:List[Int]):List[Int] = {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution*/
    var b = scala.collection.mutable.ListBuffer.empty[Int]
     for(a_i <- 0 to arr.size-1) {
          if(a_i % 2 != 0){
            b += arr(a_i)
          }
     }
    b.toList
  }

  def main(args: Array[String]): Unit = {
    scala.io.StdIn
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt
    var a = new Array[Int](n)

    for(a_i <- 0 to n-1) {
      a(a_i) = sc.nextInt
    }
    f(a.toList).map(x=> println(s"$x"))
  }

}
