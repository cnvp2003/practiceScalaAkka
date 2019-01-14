package pubSub

//Type of subscribers
sealed  trait SignalType {
  def signal(msg:String)
}

case object Relay extends SignalType{
  override def signal(msg:String): Unit = println(s"RELAYYYY ${msg}")
}

case object Speaker extends SignalType {
  override def signal(msg:String): Unit = println(s"Speakers ${msg}")
}

//Topics
sealed trait RadioChannel
case object NewsRadio extends RadioChannel
case object SongsRadio extends RadioChannel


//Pub/Sub
object RadioMast {
  var receiversList: Map[RadioChannel, List[SignalType]] = Map.empty

  //this is the "subscribe"
  def registerReceivers(signaltype: RadioChannel, receiverMethod: SignalType) {
    //add a subscriber to this signal type
    receiversList += (signaltype -> receiversList.get(signaltype).map(x => receiverMethod :: x).getOrElse(List(receiverMethod)))
    println(s"receiversList ${receiversList}")
  }

  //this is the "publish"
  def broadcast(signaltype: RadioChannel, message:String) {
    receiversList.get(signaltype).map { x =>
      x.map(y=>y.signal(message))
    }
  }
}

object pubSub {
  def main(args: Array[String]): Unit = {
    //Subscribe to channel
    RadioMast.registerReceivers(NewsRadio, Relay)
    RadioMast.registerReceivers(NewsRadio, Speaker)
    RadioMast.registerReceivers(SongsRadio, Speaker)

    //Broadcast message
    RadioMast.broadcast(NewsRadio, "GOOD Morning")
    RadioMast.broadcast(SongsRadio, "heyyyyy")
  }
}