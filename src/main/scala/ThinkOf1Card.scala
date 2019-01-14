/*
OutPut: Throws a runtime exception

Explanation:
In order to be able to compile 1.isInDeck, the compiler needs to find an implicit conversion from Int to Card. While it may appear that only one candidate, intToCard, is in scope, there are actually two options available to the compiler: deck, as a List[Card], is also a function Int => Card.

  Surprisingly, the fact that there are two available options does not cause an "ambiguous implicits" error: the compiler prefers implicit vals of function type to implicit defs. As explained by Jason Zaugg, this behaviour is not covered by the language specification.*/

object ThinkOf1Card {
  import scala.language.implicitConversions

  case class Card(number: Int, suit: String = "clubs") {
    val value = (number % 13) + 1
    // ace = 1, king = 13
    def isInDeck(implicit deck: List[Card]) = deck contains this
  }

  implicit val deck = List(Card(1, "clubs"))
  implicit def intToCard(n: Int) = Card(n)

  def main(args: Array[String]): Unit = {
    println(1.isInDeck)
  }
}