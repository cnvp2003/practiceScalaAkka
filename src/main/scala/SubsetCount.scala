
object SubsetCount {


  def main(args: Array[String]): Unit = {

    val ss = Array(3, 5, 7, 12)
    val pivot = 15

    println(s" ... ${getLimit(ss, pivot)}")

    println(s"FF ${ss.toSeq.combinations(10)}")

   // List("a", "b", "c").xcombinations(2)

    println(findSubForGiveSum(Set(3, 5, 7, 12), 15))


  }


  def findSubForGiveSum(set: Set[Int], total:Int) =  {
    set.subsets().map {
      case x if x.sum == total => x
      case _ => Set.empty
    }.filter(_.nonEmpty).toSet


  }


  def flatMapSublists[A,B](ls: List[A])(f: (List[A]) => List[B]): List[B] =
    ls match {
      case Nil => Nil
      case sublist@(_ :: tail) => f(sublist) ::: flatMapSublists(tail)(f)
    }

  def combinations[A](n: Int, ls: List[A]): List[List[A]] =
    if (n == 0) List(Nil)
    else flatMapSublists(ls) { sl =>
      combinations(n - 1, sl.tail) map {sl.head :: _}
    }



  def getLimit1(nums: Array[Int], limit: Int): Array[Int] = {
    val subset = nums.filter(limit.>=)
    if (subset.sum <= limit) subset
    else {
      val res = (1 to subset.length).view
        .flatMap(subset.combinations)
        .find(_.sum == limit)
      if (res.isEmpty) getLimit(subset, limit-1)
      else res.get
    }
  }

  def getLimit(nums: Array[Int], limit: Int): Array[Int] = {
    val subset = nums.filter(limit.>=)
    if (subset.isEmpty) Array()
    else (1 to subset.length).flatMap(subset.combinations)
      .find(_.sum == limit)
      .fold(getLimit(subset, limit-1))(identity)
  }



}
