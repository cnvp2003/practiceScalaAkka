package dataStructure

object TestList {

  sealed trait List[+A]

  case object Nil extends List[Nothing]

  case class Cons[+A](head: A, tail: List[A]) extends List[A]
/*

  def addition(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(h,t) => h + addition(t)
  }

  /*val x = List(1, 2, 3, 4, 5) match {
    case Cons(x, Cons(2, Cons(4, _))) => x
    case Nil => 42
    case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
    case Cons(h, t) => h + sum(t)
    case _ => 101
  }
  x shouldBe 3*/

  def tail[A](l: List[A]): List[A] ={
    l match {
      case Nil => sys.error("tail of empty list")
      case Cons(_, t) => t
    }
  }

  def setHead[A](l: List[A], h: A): List[A] = l match {
    case Nil => sys.error("setHead on empty list")
    case Cons(_, t) => Cons(h, t)
  }
*/

 // tail(List(1, 2, 3))

  def main(args: Array[String]): Unit = {
   /* println(tail(List(1, 2, 3)))
    println(tail(List(1)))*/


    //init(List(1,2,3))
  }

  def init[A](l: List[A]): List[A] =
    l match {
      case Nil => sys.error("init of empty list")
      case Cons(_, Nil) => Nil
      case Cons(h, t) => Cons(h, init(t))
    }
}