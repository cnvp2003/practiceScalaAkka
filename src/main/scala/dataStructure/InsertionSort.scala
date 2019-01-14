package dataStructure

import scala.annotation.tailrec

object InsertionSort{
  def main(args: Array[String]): Unit = {
    val num = List.fill(10)(util.Random.nextInt(100))
    println(s"Before: ${num} ")
    println(s"After: ${insertionSort(num)} ")
  }

 /* def insertionSort(xs: List[Int]): List[Int] = {
    def insert(y: Int, sorted: List[Int]): List[Int] =
      sorted match {
        case Nil => y :: List()
        case z :: zs =>
          if (y < z) y :: z :: zs
          else z :: insert(y, zs)
      }

    xs match {
      case Nil => List()
      case y :: ys => insert(y, insertionSort(ys))
    }
  }*/


  def insert(y: Int, sorted: List[Int], result: List[Int]): List[Int] ={
    sorted match {
      case Nil => y :: result
      case z :: zs =>
        //if (y < z) y :: z :: zs ::: result
        if (y < z) y :: insert(y, zs, result)
        else z :: insert(y, zs, result)
    }
  }


  def insertionSort(xs: List[Int]): List[Int] = {

    xs match {
      case Nil => List()
      case y :: ys => insert(y, insertionSort(ys), Nil)
    }
  }
}
