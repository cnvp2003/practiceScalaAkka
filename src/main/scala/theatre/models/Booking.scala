package theatre.models

import java.sql.Time
import java.util.{Date, UUID}

import theatre.status.PaymentStatus.PaymentStatus

/**
  * Created by pati80 on 03/11/2018.
  */
case class Booking(id: UUID = UUID.randomUUID(), userId: UUID, screenPlayId: UUID, bookedSeats: List[Movie], amount: Int,
  statusOfPayment: PaymentStatus, bookedDate: Date, movieTiming: Time)