package akka

import akka.actor.{Actor, ActorSystem, Props}
import akka.pattern.ask
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}
import akka.util.Timeout

object AskTell extends App {

  val system = ActorSystem("AskTell-Pattern")
  val myActor = system.actorOf(Props[TestActor1], "Test1")

  // (1) this is one way to "ask" another actor
  implicit val timeout = Timeout(5 seconds)
  val future = myActor ? "hello"
  val result = Await.result(future, timeout.duration).asInstanceOf[String]
  println(result)

  // (2) this is a slightly different way to ask another actor
  val future2: Future[String] = ask(myActor, "hello").mapTo[String]
  val result2 = Await.result(future2, 1 second)
  println(result2)

  import scala.concurrent.ExecutionContext.Implicits.global
  // (3)
  myActor ? "hello" map{x => println(s"map ${x}")}

  system.shutdown

  //shutdown actorsystem
  system.terminate()
}


class TestActor1 extends Actor {
  def receive = {
    case "hello" =>
      sender ! "Hello Back"
      //println("hello back at you")
    case _       => println("huh?")
  }
}