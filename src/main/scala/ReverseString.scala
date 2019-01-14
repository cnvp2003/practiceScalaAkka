
object ReverseString {

  def main(args: Array[String]): Unit = {

    val x = "scala is awesome"
    println(s"REVERSE ${x.reverse}")

    println(s"Reverse: ${reverse(x)}")

    println(s"Reverse Left ${x.foldLeft("")((a, x) => x + a)}")
    println(s"Reverse Right ${x.foldRight("")((a, x) => x + a)}")
    println(s"Reverse Reduce LEFT ${x.reduceLeft((a: Any, x:Char) => x + a.toString)}")

    //(xs reduceLeft ((a: Any, b: Int) => a + b.toString)).toString
  }

  /*def reverse(s: String): String =
    (for (i <- s.length - 1 to 0 by -1) yield s(i)).mkString

  def reverse(s: String): String =
    (for (i <- s.length until 0 by -1) yield s(i - 1)).mkString

  def reverse(s: String) = ("" /: s) ((a, x) => x + a)

  def reverse(s: String) = ("" /: s) (_.+:(_))*/

  //recursion
  def reverse(s: String): String = {
    if (s.isEmpty) ""
    else reverse(s.tail) + s.head
  }

  //tail receursion
  def reverseF(s: String, acc: String): String = s match {
    case  s if s.isEmpty => acc
    case _ => reverseF(s.tail, acc + s.head)
  }

}
