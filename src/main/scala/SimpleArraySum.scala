/**
 * Created by pati80 on 3/5/16.
 */
/*
object SimpleArraySum {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    var n = sc.nextInt()
    var arr = new Array[Int](n)
    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt()
    }
    println(arr.map(_.toInt).sum)
  }
}*/

object Demo {
  val nums: List[Int] = List(1, 2, 3, 4)
  val fruit: List[String] = List("apples", "oranges", "pears")

  def main(args: Array[String]) {
    println(matchTest(nums))
    println(matchTest(fruit))
  }

  def matchTest(x: List[Any]):Any = x match {
  /*  case 1 => "one"             //
    case "apples" => 2            // Won't work ..
    case y: Int => "scala.Int"*/  //
    case _ => "many"
  }
}