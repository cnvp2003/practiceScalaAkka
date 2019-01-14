

/**
  * Created by pati80 on 15/09/2018.
  */

abstract class InputValue
case class AnInt(i1: Int) extends InputValue
case class AString(s1: String) extends InputValue
case class AAny(a: Any) extends InputValue

object FlexTrade extends App {
/*
  def wrap(a: Any): InputValue = {
    a match {
      case i1: Int => AnInt(i1)
      case s1: String => AString(s1)
      case a1: Any => AAny(a)
    }
  }

  def process(inVal: InputValue): String = {
    inVal match {
      case AnInt(i2) if(i2%2 ==0) => "Even integer"
      case AnInt(_) => "Odd integer"
      case AString(_) => "A string"
      case other => "Something else"
    }
  }

  print("Enter an Integer: ")
  val number = scala.io.StdIn.readInt()
  val analysis = process(wrap(number))
  println(s"Hello: $analysis!")



    def f1[T1](a: T1) = a
    def f2[T2](a: T2) = "Hello, " + a
    val b: Any = f2(f1(42))
*/

 /* import play.api.libs.ws._
  import scala.util.{Failure, Success}
  val restEndPoint = "http://myserver.com/api/"

  def getForecastOrOrder(typ: String, year: Int)={

    val foreCastUrl = s"${restEndPoint}${typ}/${year}"
    val request = WS.url(foreCastUrl).withMethod("GET").execute()

    request.onComplete {
      case Success(response) => {(response.json \ "status" \ "data").as[String]}
      case Failure(response) => {Json.obj("status" ->"OK", "message" -> ("Illegal value for year") )}
    }
  }*/
}