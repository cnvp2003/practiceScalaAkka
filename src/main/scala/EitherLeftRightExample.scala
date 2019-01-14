/**
  * Created by pati80 on 30/10/2018.
  */

object EitherLeftRightExample extends App {

  /**
    * A simple method to demonstrate how to declare that a method returns an Either,
    * and code that returns a Left or Right.
    */
  def divideXByY(x: Int, y: Int): Either[String, Int] = {
    if (y == 0) Left("Dude, can't divide by 0")
    else Right(x / y)
  }

  // a few different ways to use Either, Left, and Right
  println(divideXByY(1, 0))

  divideXByY(1, 0) match {
    case Left(s) => println("Left Answer: " + s)
    case Right(i) => println("Left Answer: " + i)
  }

  println(divideXByY(1, 1))
  divideXByY(1, 1) match {
    case Left(s) => println("Right Answer: " + s)
    case Right(i) => println("Right Answer: " + i)
  }

}