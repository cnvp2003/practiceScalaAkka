package theatre.models

import java.util.UUID

/**
  * Created by pati80 on 03/11/2018.
  */
case class Theater(id: UUID = UUID.randomUUID(), name: String, address: Address, noOfScreen: Int)

object Theater{

  def createTheater()={

  }
}
