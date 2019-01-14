import java.util.UUID

import akka.actor._

import scala.collection.mutable
import akka.actor.{Actor, ActorRef}

/*case class Subscribe(channel: Channel, actor: ActorRef)
case class Publish(channel: Channel, payload: Any, retain: Boolean = false)*/

//case class Channel(id: UUID = UUID.randomUUID(), name: String, phoneNumber: Option[String])
case class User(id: UUID = UUID.randomUUID(), name: String)
case class Following(channelId: UUID, UserId: UUID)
case class PhoneNumber(number: String)



case class Subscribe(user: User)
case class UnSubscribe(user: User)
case class Broadcast(message:String, user: User)

/*class ChannelActorGroup extends Actor {
  //create channel
  //update channel
  //delete channel

  override def receive = {

  }
}*/

class ChannelActor(id: UUID = UUID.randomUUID(), name: String, phoneNumber: Option[String]) extends Actor {
  def subscribe(user: User) = ???  // add user to list
  def unsubscribe(user: User) = ??? // broadcast message to all the subscribe users and apply logic to find the channel
  // having same numbers and update number with minimal effect
  def broadCast = ???  // remove user from list

  override def receive = {
    case Subscribe(user) => {
      //subscribe(user)
      println(s"${user} Subscribe to channel: ${name}")
    }
    case UnSubscribe(user) => {
     // unsubscribe(user)
      println(s"${user} Subscribe to channel: ${name}")
    }
    case Broadcast => broadCast
    case _ => println(s"DEFAULLTTTTTT")
  }
}

object TestApp extends App {
  val system = ActorSystem("Broadcasting")
  val actor0 = system.actorOf(Props(new ChannelActor(name="Credit Card Channel",phoneNumber = None)))
  val actor1 = system.actorOf(Props(new ChannelActor(name="Debit Card Channel",phoneNumber = None)))

  val user1 = User(name="testUser1")
  val user2 = User(name="testUser2")
  val user3 = User(name="testUser3")

  actor0 ! Subscribe(user1)
  actor1 ! Subscribe(user3)



  /*actor ! Publish(channel, "Hey How r u?")
  actor ! Publish(channel1, "Good Morning!!")
  actor ! Publish(channel2, "Weather is good today")*/

  system.terminate()
}

/*class BroadcastActor extends Actor {
  val recipients = mutable.MutableList.empty[ActorRef]

  override def receive = {
    case Subscribe(channel: Channel, actorRef: ActorRef) =>{
      recipients += actorRef
    }

    case publish : Publish =>{
      recipients.map(_ ! publish)
    }
  }
}*/


/*object DataStore {
  import scala.collection.mutable.{ListBuffer => MList}
  val Channels:MList[Channel]  = _
  val Users: MList[User] = _
  val Followings: (Channel, User) = _
  val PhoneNumbers: MList[String] = _
}*/

