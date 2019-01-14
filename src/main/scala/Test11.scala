import scala.annotation.tailrec

/**
  * Created by pati80 on 06/12/2018.
  */
object Test11 {

  def main(args: Array[String]): Unit = {
    val a = List(2, 4, 5, 0, 0, 5, 5, 4, 8, 6, 0, 6, 8)
    //val a = List(0, 0, 2, 4, 5, 0, 0, 5, 5, 4, 3, 0, 3, 8, 6, 0, 6, 8)
   // val a = List(0, 0, 2, 4, 5, 0, 0, 5, 5, 4, 3, 0, 3, 8, 6, 0,0,0,6)
   // val a = List.fill(100)(util.Random.nextInt(100))

   /* 2 4 5 0 0 5 5 4 8 6 0 6 8
   2 4 10 5 4 8 12 8 0 0 0 0 0
    Output:
    2 4 10 5 4 8 12 8 0 0 0 0 0*/
    println(s"Before: ${a} ")
    println(s" s ${compare(a, (x: Int, y: Int) => x+y, Nil)}")

    // println(s"FACT : ${factorial(4)}")
   // println(validDna("SAT"))

/*  var x = 0
    lazy val y = 1/x
    try {
      println(y)
    } catch {
      case _ : Throwable =>
        x = 1
        println(y)
    }*/

   /* println(s"SIZE: ${size(List(1, 2))}")
    println(s"SIZE: ${size(List("a", "b", "c"))}")*/

    val ss = ""
    ss match {
      case "" => println("false")
      case _ => println("TRUE")
    }
  }

  def size[A](xs: List[A]): Int ={
    xs match {
      case Nil => 0
      case y :: ys =>  1 + size(ys)
    }
  }

  def validDna(maybeDna: String) = {
    def containsOnly(s: String, chars: Array[Char]) ={
      val aa = s.split(chars)
      aa.map(x=> println(x))
      aa.isEmpty
    }
    containsOnly(maybeDna, Array('A', 'C', 'G', 'T'))
  }

  @tailrec
  def compare(list:List[Int], f:(Int, Int)=>Int, l1:List[Int]): List[Int]= {
    list match {
      case h :: Nil => {
        if (!l1.isEmpty && l1.last == h) {
          val a = f(h, l1.last)
          val l2 = l1.dropRight(1)
          l2 :+a
        }else{
          l1 :+h
        }
      }
      case h :: tail if (h == 0) => compare(tail, f, l1)
      case h :: tail if (!l1.isEmpty && l1.last == h) => {
         val a = f(h, l1.last)
         val l2 = l1.dropRight(1)
         compare(tail, f, l2 :+a)
      }
      case h :: tail if (h != 0)=> {
        compare(tail, f, l1 :+ h)
      }
     }
  }

  def factorial(n: Int): Int = {
    @tailrec
    def iter(x: Int, result: Int): Int =
      if (x == 0) result
      else iter(x - 1, result * x)

    iter(n, 1)
  }
}