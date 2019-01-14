package theatre.status

/**
  * Created by pati80 on 03/11/2018.
  */

object SeatType {
sealed trait SeatType

object Silver extends SeatType
object Gold extends SeatType
object Platinum extends SeatType

}