package theatre.status

/**
  * Created by pati80 on 03/11/2018.
  */

object PaymentStatus {
sealed trait PaymentStatus

object Paid extends PaymentStatus
object NotPaid extends PaymentStatus
}