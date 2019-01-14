package scala.codeChallange

object ReverseSentance {

  def main(args: Array[String]) {
    import java.io.{BufferedReader, InputStreamReader}
    val in = new BufferedReader(new InputStreamReader(System in))
    val input = in readLine

    val reversedString = input.toLowerCase.split("\\s+").toList

    reversedString.map(_.reverse).mkString(" ").map(print)

    //reversedString.reverse.map(print)

    println(reverse(List(1, 3, 4, 2)))
  }


  def reverse(list: List[Int]): String ={
    val a: String = list.reverse.map(_.toString).mkString(" ")
    a.trim
  }
}
