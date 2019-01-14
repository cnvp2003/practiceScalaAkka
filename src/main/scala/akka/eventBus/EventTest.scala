package akka.eventBus

import akka.actor.{Actor, ActorSystem, Props}


//Channels
abstract class AllKindsOfMusic {
  def artist: String
}
case class Jazz(artist: String) extends AllKindsOfMusic
case class Electronic(artist: String) extends AllKindsOfMusic


//Listner (Subscriber)
class Listener extends Actor {
  def receive = {
    case m: Jazz ⇒ println(s"${self.path.name} is listening to: ${m.artist}")
    case m: Electronic ⇒ println(s"${self.path.name} is listening to: ${m.artist}")
  }
}


object EventTest extends App {
  val system = ActorSystem("EventBus")

  val jazzListener = system.actorOf(Props[Listener], "Jazz-Lover")
  val musicListener = system.actorOf(Props[Listener], "Music-Lover")
  val electronicListener = system.actorOf(Props[Listener], "Electronic-Lover")

  system.eventStream.subscribe(jazzListener, classOf[Jazz])
  system.eventStream.subscribe(jazzListener, classOf[Electronic])
  system.eventStream.subscribe(electronicListener, classOf[Electronic])
  //system.eventStream.subscribe(musicListener, classOf[AllKindsOfMusic])

  // only musicListener gets this message, since it listens to *all* kinds of music:
  system.eventStream.publish(Electronic("Parov Stelar"))
  //system.eventStream.publish(Electronic("Parov Stelar22"))

  // jazzListener and musicListener will be notified about Jazz:
  //system.eventStream.publish(Jazz("Sonny Rollins"))
}