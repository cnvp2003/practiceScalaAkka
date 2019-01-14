import java.util.concurrent.ConcurrentHashMap

/**
  * Created by pati80 on 22/11/2018.
  */
object  Equals {

  val seats = new ConcurrentHashMap[Seat, Seat]

  def main(args: Array[String]) {
    val s1 = Seat("A1", 1234, "Platinum", "NotBooked")
    val s2 = Seat("A1", 1234, "Platinum", "Booked")

    seats.put(s1, s1)
    seats.put(s2, s2)

    println(s"Size ${seats.size()}")
  }
}


//case class Seat(id: String, screenPlay: Int, typ: String, status: String)


// var is used for status, equals and hashcode is overide to check equality on other properties
case class Seat(id: String, screenPlay: Int, typ: String, var status: String){

  override def equals(that: Any): Boolean =
    that match {
      case that: Seat => this.id == that.id && this.screenPlay == that.screenPlay
      case _ => false
    }
  override def hashCode: Int = {
    val prime = 31
    var result = 1
    result = prime * result + (if (id == null) 0 else id.hashCode)
    result
  }
}