package scala.codeChallange

object ArraySum {

  def splitArrayWithEqualSum(ints: List[Int]): (List[Int], List[Int]) = {
    val mid = ints.sum /2
    val sortedList = ints
    var sum = 0

    var index = 0
    for(i <- 0 to sortedList.size - 1) {
       sum += sortedList(i)
      if(sum == mid)
        index = i
    }

    (sortedList.take(index + 1), sortedList.drop(index + 1))
  }

/*
  def printPair(list: Array[Int], sum: Int): Unit ={
    val bolArray: Array[Boolean] = new Array[Boolean](10000)
    for(i <- 0 to list.size - 1) {
      val temp = sum - list(i)
      if(temp >=0 && bolArray(temp)){
        println(List(list(i), temp))
      }

      bolArray(list(i)) = true
    }
  }
*/
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for (arr_i <- 0 to n - 1) {
      arr(arr_i) = sc.nextInt();
    }

    val mid = arr.toList.sum / 2

   // val result = splitArrayWithEqualSum(arr.toList)

    //println(result._1 + " " + result._2)
//    printPair(arr, mid)
  }


}
