package scala.codeChallange

object CutTheSticks {


  def getListOfArray(ints: List[Int] , list: List[Int]): List[Int] = {

    def subsctractMinAndFilterZero(l:List[Int]) = ints.map(_ - l.min).filter(_ > 0)


    if(ints.size > 1)
      getListOfArray(subsctractMinAndFilterZero(ints), List(ints.size)) ++ list
    else
      List(ints.size) ++ list
  }

  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt();
    }

    val result = if(arr.size > 0 && arr.size < 10000) getListOfArray(arr.toList, List.empty) else List.empty
    result.sorted.reverse.map(println)
  }
}
