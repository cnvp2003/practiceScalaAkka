package theatre.status

/**
  * Created by pati80 on 03/11/2018.
  */

object MovieStatus {
sealed trait MovieStatus

object Released extends MovieStatus
object ComingSoon extends MovieStatus
}