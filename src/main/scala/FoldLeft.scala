
object FoldLeft {


  //def foldLeft[B](z: B)(op: (B, A) ⇒ B): B     //signature of foldLeft



  def main(args: Array[String]) {

    //val prices: Seq[Double] = Seq(1.5, 2.0, 2.5)
    val prices = List.fill(10)(util.Random.nextInt(100))

    println(s"LEFT => ${prices.foldLeft(5.0)(_+_)}")

    val sum = prices.foldLeft(0.0)(_ + _)
    println(s"Sum = $sum")

    val ss = prices.foldLeft(0) {
      (x, l) =>
        println(s"SS $x ... $l")
        x + l
    }

    println(s"Right => ${prices.foldRight(5.0)(_+_)}")

    val sumR = prices.foldRight(0.0)(_ + _)
    println(s"Sum = $sumR")


    // result: -1 and -2 as it corsses int max valu
     /*   val r = (1 to 100).foldLeft(1) {
          case (acc, cycle) => if (cycle % 2 == 1) {
            println(s"Acc $acc")
            acc * 2
          } else {

            println(s"Acc else $acc")
            acc + 1
          }
        }
        println(s"RR $r")*/

  }
}