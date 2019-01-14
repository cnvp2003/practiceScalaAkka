package dataStructure

object QuickSort {

  def main(args: Array[String]): Unit = {
    val num = List.fill(5)(util.Random.nextInt(100))
    //println(s"Before: ${num} ")
    //println(s"After: ${quickSort(num)} ")


    println(s"Before: quickSortTR ${num} ")
    println(s"After: quickSortTR ${quicksort(num)((x:Int, y:Int) => x<y)} ")
    println(s"After: quickSort... ${quickSortt(num)} ")
  }

  //O(n lon n)
  //def quickSort[A](list: List[A]):List[A] ={    // needs to implement ordering
   def quickSortt(list: List[Int]):List[Int] = {
    list match {
      case Nil => list
      case h :: Nil => list
      case pivot :: tail =>
        val (less, greater) = tail.partition(_ < pivot)
        quickSortt(less) ::: (pivot :: quickSortt(greater))
    }
  }


 /* def quickSort(list: List[Int]): List[Int] = {
    list match {
      case Nil => list
      case h :: Nil => list
      case pivot :: tail =>
        val (less, greater) = tail.partition(_ < pivot)
        quickSortTR(less) ::: quickSort(greater)
    }
  }

  def quickSortTR(list: List[Int], res: List[Int]) = {
    list match {
      case Nil => res
      case h :: Nil => h :: res
      case pivot :: tail =>
        // val (less, greater) = tail.partition(_ < pivot)

        quickSortTR(quickSort(less) ::: pivot ::: quickSort(greater), Nil)
    }
  }
*/


  /*def quicksort[T](xs: List[T])(lt: (T,T) => Boolean) = {
    @annotation.tailrec
    def qsort(todo: List[List[T]], done: List[T]): List[T] = todo match {
      case Nil => done
      case xs :: rest => xs match {
        case Nil => qsort(rest, done)
        case x :: xrest =>
          println(s"HEAD $x Tail $xrest")
          val (ls, rs) = (xrest partition(lt(x,_)))
          if (ls.isEmpty) {
            if (rs.isEmpty) qsort(rest, x :: done)
            else qsort(rs :: rest, x :: done)
          }
          else qsort(ls :: List(x) :: rs :: rest, done)
      }
    }
    qsort(List(xs),Nil)
  }*/


  def quicksort(xs: List[Int])(lt: (Int,Int) => Boolean) = {
    @annotation.tailrec
    def qsort(todo: List[Int], done: List[Int]): List[Int] = todo match {
      case Nil => done
      //case xs :: rest => xs match {
       // case Nil => qsort(rest, done)
        case x :: xrest =>
          println(s"HEAD $x Tail $xrest")
          val (ls, rs) = (xrest partition(lt(x,_)))
          println(s"ls $ls and ${rs}")
          if (ls.isEmpty) {
            println(s"ls empty ${rs}")
            if (rs.isEmpty) {
              println(s"rs empty ${xrest}")
              qsort(xrest, x :: done)
            }
            else {
              println(s"Only ls empty ${rs}  RS ${rs}" )
              qsort(rs, x :: done)
            }
          }
          else {
            println(s"NOTTT $rs")
            qsort(rs, x ::done)
          }
      }
    qsort(xs,Nil)
  }
}


