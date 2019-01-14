package theatre.status

/**
  * Created by pati80 on 03/11/2018.
  */

object SeatStatus {
sealed trait SeatStatus

object Booked extends SeatStatus
object NotBooked extends SeatStatus
}