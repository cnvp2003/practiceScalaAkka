package akka.producerConsumer

/**
  * Created by pati80 on 1/9/18.
  */
import akka.actor.Actor

abstract class Message

case class ValueProduced(newValue: Int, producer: Actor) extends Message
case class ValueRead() extends Message
case class EndOfInput() extends Message
