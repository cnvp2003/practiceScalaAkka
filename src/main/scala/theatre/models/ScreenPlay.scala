package theatre.models

import java.util.UUID

import theatre.status.SlotType

/**
  * Created by pati80 on 03/11/2018.
  */
case class ScreenPlay(id: UUID = UUID.randomUUID(), theaterId: UUID, movieId: UUID, slot: SlotType)
