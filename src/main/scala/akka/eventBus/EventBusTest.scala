package akka.eventBus
/*
import scala.collection.mutable
import akka.actor.{Actor, ActorRef, ActorSystem, Props}
import eventBus.Bus.{Publish, Subscribe}


object Bus {
  case class Subscribe(topic: String, actor: ActorRef)
  case class Unsubscribe(topic: String, actor: ActorRef)
  case class Publish(topic: String, payload: Any, retain: Boolean = false)
}

class HashBus() extends Actor {
  val topicActors = mutable.Map.empty[String, ActorRef]

  def createDistributionActor = {
    context.actorOf(Props[DistributionActor])
  }

  override def receive = {
    case subscribe : Subscribe =>
      topicActors.getOrElseUpdate(subscribe.topic, createDistributionActor) ! subscribe

    case publish : Publish =>
      topicActors.get(topic).foreach(_ ! publish)
  }
}

class DistributionActor extends Actor {

  val recipients = mutable.List.empty[ActorRef]

  override def receive = {
    case Subscribe(topic: String, actorRef: ActorRef) =>
      recipients +: actorRef

    case publish : Publish =>
      recipients.map(_ ! publish)
  }
}

object EventBusTest {

  def main(args: Array[String]): Unit = {
    val system = ActorSystem("System")
    val bus = system.actorOf(Props[MqttEventBus], name = "bus")
    val device1 = system.actorOf(Props(new DeviceActor(bus)))
    val device2 = system.actorOf(Props(new DeviceActor(bus)))
  }
}*/
