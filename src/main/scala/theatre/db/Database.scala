package theatre.db

import theatre.models.{Booking, Movie, ScreenPlay, User}

import scala.collection.mutable.ListBuffer

object Database {
    val bookings = ListBuffer[Booking]()
    val users = ListBuffer[User]()
    val movies = ListBuffer[Movie]()
    val screenPlays = ListBuffer[ScreenPlay]()
}