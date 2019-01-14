import java.util.UUID

import akka.actor._

import scala.collection.{Set, mutable}
import akka.actor.{Actor, ActorRef}


case class Subscribe11(channel: Channel11, actor: ActorRef)
case class Unsubscribe11(topic: String, actor: ActorRef)
case class Publish11(channel: Channel11, payload: Any, retain: Boolean = false)

case class Channel11(id: UUID = UUID.randomUUID(), name: String, phoneNumber: Option[String])

class ChannelActor11 extends Actor {
  val channelsList = mutable.Map.empty[Channel11, ActorRef]

  var set = scala.collection.mutable.Set[Channel11]()

  def createBroadcastActor = {
    context.actorOf(Props[BroadcastActor11])
  }

  override def receive = {
    case subscribe : Subscribe11 => {
      channelsList.getOrElseUpdate(subscribe.channel, createBroadcastActor) ! subscribe


      /*val aaa= !channelsList.filter(_._1.phoneNumber == subscribe.channel.phoneNumber).map(x=>x._1).toList.isEmpty

      if(aaa){
        val xx = subscribe.channel.copy(phoneNumber = Some("4234234"))
        channelsList.getOrElseUpdate(xx,createBroadcastActor) ! subscribe
      }else{
        channelsList.getOrElseUpdate(subscribe.channel, createBroadcastActor)  ! subscribe
      }*/

     /* channelsList.map { x =>
        if(x._1.phoneNumber.isDefined){
          if(x._1.phoneNumber.equals(subscribe.channel.phoneNumber)){
            subscribe.channel.copy(phoneNumber = Some("4234234"))
            //channelsList.remove(y)
            //channelsList.getOrElseUpdate(y,createBroadcastActor) ! subscribe
          }
        }
      }

      //if(channelsList.isEmpty) channelsList.getOrElseUpdate(subscribe.channel, createBroadcastActor) ! subscribe
      channelsList.getOrElseUpdate(subscribe.channel, createBroadcastActor) ! subscribe
*/
      /*println(s" SSSSS ${channelsList.keySet}")
      val aa = channelsList.keySet.toList.groupBy(_.phoneNumber)
      val bb: List[Channel1] = aa.toList.filter(_._2.size >= 2).flatMap(x=>x._2)  // channels having same phone number

      println(s" SSSSSEEETTTTTTT ${aa.toList.filter(_._2.size >= 2)}")
      println(s" bb ${bb}")
      bb.map { x =>
        val y = x.copy(phoneNumber = Some("4234234"))
        channelsList.remove(x)
        channelsList.getOrElseUpdate(y,ss)
      }

      ss ! subscribe
      //! subscribe*/
    }

    case publish : Publish11 =>
      channelsList.map( x=> println(s"Channels: ${x._1}"))
      channelsList.get(publish.channel).foreach(_ ! publish)
  }
}

class BroadcastActor11 extends Actor {
  val recipients = mutable.MutableList.empty[ActorRef]

  override def receive = {
    case Subscribe11(channel: Channel11, actorRef: ActorRef) =>{
      recipients += actorRef
    }

    case publish : Publish11 =>{
      recipients.map(r => println(s"Recipients: ${r.path.name}"))
      recipients.map(_ ! publish)
    }
  }
}

/*
case class Channel(id: UUID, name: String, phoneNumber: Option[String])
case class User(id: UUID, name: String)
case class Following(channelId: UUID, UserId: UUID)
case class PhoneNumber(number: String)
*/


class Subscriber11 extends Actor {
  override def receive: Receive = {
    case publish: Publish11 => println(s"I am ${self.path.name}. Receive message as ${publish.payload} from ${publish.channel.name}.")
  }
}

object TestApp11 extends App {
  val system = ActorSystem("HierarchyHashBus")
  val actor = system.actorOf(Props[ChannelActor11], "HashBus")

  val subscriber1 = system.actorOf(Props[Subscriber11], name = "subscriber-1")
  val subscriber2 = system.actorOf(Props[Subscriber11], name = "subscriber-2")

  val channel = Channel11(name="NEWS SMS", phoneNumber = Some("9988776655"))
  val channel1 = Channel11(name="WEATHER SMS", phoneNumber = Some("9988776655"))
  val channel2 = Channel11(name="NEWS2 SMS", phoneNumber = Some("32321"))

  //actor ! Subscribe(channel, subscriber1)
  actor ! Subscribe11(channel, subscriber2)
  actor ! Subscribe11(channel2, subscriber2)
  actor ! Subscribe11(channel1, subscriber2)
  actor ! Publish11(channel, "Hey How r u?")
  actor ! Publish11(channel1, "Hey How r u?")
  actor ! Publish11(channel2, "Hey How r u?")
}