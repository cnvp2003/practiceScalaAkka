
object Test1 {

  def main(args: Array[String]): Unit = {
    val a = List(2 4 5 0 0 5 5 4 8 6 0 6 8)

    println(s"s ${compare(a)}")
  }


  def compare(list:List[Int], f:(Int, Int)=>Int):List[Int]=
  {

    val a = list match {
      case h :: Nil if(h == 0) => 0
      case l :: m :: tail if(l == m) =>  f(l, m)
      case l :: m :: tail if(l < m) => f(l, m) && compare(tail, f)
    }

    a.toList

  }




}