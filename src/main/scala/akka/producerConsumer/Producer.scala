
package akka.producerConsumer

/**
  * Created by pati80 on 1/9/18.
  */

import akka.actor.Actor
import akka.actor.Actor.Receive

class Producer(
                val cycles: Int,
                val productionTime: Int,
                val consumers: List[Actor])
  extends Actor {
  private var consumersConsumed = 0
  private var currentValue = 0

  /*case class ProduceNewValue(cycleNum: Int)
  case class NewValueProduced(value: Int)

  private val producer = actor {
    loop {
      self.react {
        case ProduceNewValue(x) =>
          Thread.sleep(productionTime)
          Producer.this ! NewValueProduced(x)
        case x => println("Unhandled message in producer: "+ x)
      }
    }
  }

  def act() {
    producer ! ProduceNewValue(currentValue)
    loop {
      if (consumersConsumed == consumers.length - 1) {
        consumersConsumed = 0
        if (currentValue < cycles) {
          currentValue += 1
          producer ! ProduceNewValue(currentValue)
        } else {
          sendToAllConsumers(EndOfInput())
          exit()
        }
      }
      receiveMessage()
    }
  }

  private def receiveMessage() {
    react {
      case ValueRead() => consumersConsumed += 1
      case NewValueProduced(x) =>
        println("Producer: new value: "+ x)
        sendToAllConsumers(ValueProduced(x, self))
      case msg => println("unhandled message in Producer: "+ msg)
    }
  }

  private def sendToAllConsumers(msg: Message) {
    for (consumer <- consumers)
      consumer ! msg
  }*/
  override def receive: Receive = ???
}
