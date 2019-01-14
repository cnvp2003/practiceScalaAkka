package akka.producerConsumer

/**
  * Created by pati80 on 1/9/18.
  */
import akka.actor.Actor
import akka.actor.Actor.Receive


class Consumer(number: Int) extends Actor {
/*  def act() {
    loop {
      react {
        case ValueProduced(x, producer) =>
          println(this + ": read value: "+ x)
          producer ! ValueRead()
        case EndOfInput => exit()
        case x => println("Unhandled message in Consumer: "+ x)
      }
    }
  }

  override def toString =
    "Consumer #"+ number

  start()*/
  override def receive: Receive = ???
}