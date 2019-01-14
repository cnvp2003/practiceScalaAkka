package dataStructure

import scala.annotation.tailrec

object MergeSort {
  implicit def IntLessThan(x: Int, y: Int) = x < y
  def main(args: Array[String]): Unit = {
    val num = List.fill(120000)(util.Random.nextInt(10000))
    println(s"Before: ${num} ")
    println(s"After: ${mergeSort(num)} ")
  }

//Not Tail recursion .. stack overflow for large number of elements
  //this functional merge sort but will not work with large data sets
  //def merge[A](first:List[A], second:List[A]):List[A]={
 /* def merge(first:List[Int], second:List[Int]):List[Int]={
    (first, second) match {
      case (Nil, _) => second
      case (_, Nil) => first
      case (x :: xs, y :: ys) =>{
        if(x <= y) x :: merge(xs, second)
        else y :: merge(first, ys)
      }
    }
  }

  //def mergeSort[A](list:List[A]):List[A]={
  def mergeSort(list:List[Int]):List[Int]={
    list match {
      case x :: Nil => list
      case x :: xs => {
        //val (first:List[A], second:List[A]) = lst.splitAt(lst.length/2)
        val (first:List[Int], second:List[Int]) = list.splitAt(list.length/2)
        merge(mergeSort(first), mergeSort(second))
      }
    }
  }*/

  //implicit def IntLessThan(x: Int, y: Int) = x < y

  // O(n log n)   /// it is slow but efficient
  @tailrec
  def merge[A](first:List[A], second:List[A], result:List[A])(implicit lessThan: (A, A) => Boolean):List[A]={
    (first, second) match {
      case (Nil, _) => result.reverse ::: second
      case (_, Nil) => result.reverse ::: first
      case (x :: xs, y :: ys) =>{
        if(lessThan(x, y)) merge(xs, second, x ::result)
        else merge(first, ys, y :: result)
      }
    }
  }

  def mergeSort[A](list:List[A])(implicit lessThan: (A, A) => Boolean):List[A]={
    list match {
      case x :: Nil => list
      case x :: xs => {
        //val (first:List[A], second:List[A]) = lst.splitAt(lst.length/2)
        val (first:List[A], second:List[A]) = list.splitAt(list.length/2)
        merge(mergeSort(first), mergeSort(second), Nil)
      }
    }
  }

}