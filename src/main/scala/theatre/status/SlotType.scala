package theatre.status

/**
  * Created by pati80 on 03/11/2018.
  */

sealed trait SlotType

object Morning extends SlotType
object Afternoon extends SlotType
object Evening extends SlotType
object Night extends SlotType