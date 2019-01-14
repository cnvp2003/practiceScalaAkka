package akka

import akka.actor._
import akka.event.{ActorEventBus, EventBus, LookupClassification}

case class Book(title: String, authors: List[String])

class AuthorBookBus(author: String) extends EventBus
  with LookupClassification
  with ActorEventBus {

  type Event = Book
  type Classifier = Boolean

  override def mapSize = 2

  override def classify(book: Book) = book.authors.contains(author)

  override protected def publish(book: Book, subscriber: Subscriber)= subscriber ! book
}

class BookPublisher(bus: AuthorBookBus) extends Actor {

  def receive = {
    case book: Book => {
      println(s"Yeah! Publishing a new book: $book")
      bus.publish(book)
    }
  }

}

class BookSubscriber extends Actor {

  def receive = {
    case book: Book => println(s"My name is ${self.path.name} and I have received a new book: $book")
  }
}

object Main1 extends App {

  implicit val system = ActorSystem("publisher-subscribers-example")

  val author = "Author"

  val authorBookBus = new AuthorBookBus(author)
  val bookPublisher = system.actorOf(Props(new BookPublisher(authorBookBus)), name = "book-publisher")

  val subscriber1 = system.actorOf(Props[BookSubscriber], name = "subscriber-1")
  val subscriber2 = system.actorOf(Props[BookSubscriber], name = "subscriber-2")

  authorBookBus.subscribe(subscriber1, false)
  authorBookBus.subscribe(subscriber2, true)

  bookPublisher ! Book(title = "A book title", authors = List(author, "Another Author"))  //when true
  // Yeah! Publishing a new book: Book(A book title,List(Author, Another Author))
  // My name is subscriber-1 and I have received a new book: Book(A book title,List(Author, Another Author))

  bookPublisher ! Book(title = "Another book title", authors = List("Another Author"))
  // Yeah! Publishing a new book: Book(Another book title,List(Another Author))
  // My name is subscriber-2 and I have received a new book: Book(Another book title,List(Another Author))
}