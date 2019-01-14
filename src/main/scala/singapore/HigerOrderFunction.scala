package singapore



object HigerOrderFunction {
  def main(args: Array[String]): Unit = {

    println(s"Sort ${isSorted(List("aa", "bc", "ads", "asdd"), (a: String, b: String) => a.length <= b.length)}")
    //res18: Boolean = true

    println(s"Sort ${isSorted(List(1,2,3,4), (a: Int, b: Int) => a <= b)}")
    //res18: Boolean = true

    println(s"Sort ${isSorted(List(1), (a: Int, b: Int) => a <= b)}")
    //res20: Boolean = true

    println(s"Sort ${isSorted(List(), (a: Int, b: Int) => a <= b)}")
    //res21: Boolean = true

    println(s"Sort ${isSorted(List(1,2,3,4,5,6,7,8,9,10), (a: Int, b: Int) => a <= b)}")
    //res23: Boolean = true

    println(s"Sort ${isSorted(List(1,2,3,4,1,5,3,2), (a: Int, b: Int) => a <= b)}")
    //res19: Boolean = false

    println(s"Sort ${isSorted(List(2,1), (a: Int, b: Int) => a <= b)}")
    //res22: Boolean = false


    // Array
    println(s"Sort Array ${isSorted(Array(1, 3, 5, 7), (x: Int, y: Int) => x > y)}")
    //res22: Boolean = true

    println(s"Sort Array ${isSorted(Array(7, 5, 1, 3), (x: Int, y: Int) => x > y)}")
    //res22: Boolean = false

    println(s"Sort Array ${isSorted(Array("Scala", "Exercises"), (x: String, y: String) => x.length > y.length)}")
    //res22: Boolean = true

  }

  def isSorted[A](list: List[A], f:(A, A) => Boolean):Boolean = {
    list match {
      case l :: Nil => true
      case l :: m :: Nil => f(l, m)
      case l :: m :: tail => f(l, m) && isSorted(tail, f)
      case _ => true
    }
  }

  def isSorted[A](as: Array[A], f: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean =
      if (n >= as.length - 1) true
      else if (f(as(n), as(n + 1))) false
      else go(n + 1)

    go(0)
  }


  def comp[A](l: List[A], f:(A, A) => A):List[A]={
    l match {
      case h :: Nil => println("0")
       // case l :: m :: tail if(l == m) =>  f(l, m) && comp(tail, f)
    }
    l
  }


}