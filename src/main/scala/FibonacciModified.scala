package scala.codeChallange

object FibonacciModified {

  def main(args: Array[String]) {

    val input = readLine()
    val listOfNumber = input.split(" ").toList.drop(2).map(_.toInt - 3)
    var sum: Long = 0
    listOfNumber.map{
      x =>
      sum += Math.pow(x.toDouble, 2).toLong +  1
    }

    println(sum)
  }
}
