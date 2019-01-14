/**
  * Created by pati80 on 10/04/17.
  */

object FoodBill {

  def main(args: Array[String]): Unit = {
    val cost = scala.io.StdIn.readDouble()
    val tipPercent = scala.io.StdIn.readInt()
    val taxPercent = scala.io.StdIn.readInt()

    val tip = (cost * tipPercent)/100
    val tax = (cost * taxPercent)/100

    val totalCost = cost + tip + tax

    println(s"${totalCost.round}")
  }
}