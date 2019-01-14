package akka

import akka.actor.{Actor, ActorRef, ActorRefFactory, ActorSystem, Props}

case object Create
case object RandomVal


object ParentActor {
  def props = Props[ParentActor]
}

class ParentActor extends Actor {
  var counter = 0
  override def receive: Receive = {
    case Create => context.actorOf(ChildActor.props, "Child"+counter)
      counter += 1
    case _ => println(s"Nothing to do!! ${counter}")
  }
}

object ChildActor {
  def props = Props[ChildActor]
}

class ChildActor extends Actor {
  override def receive: Receive = {
    case _ => println(s"childdd")
  }
}

object ParentChild extends App{

  val system = ActorSystem("Hierarchy")
  val actor = system.actorOf(ParentActor.props, "Baap")

  actor ! Create
  actor ! RandomVal

  //shutdown actorsystem
  system.terminate()
}


/*
class Child(parent: ActorRef) extends Actor {
  def receive = {
    case "ping" => parent ! "pong"
  }
}

/*implicit ActorRefFactory required: if outside of an Actor you need an implicit ActorSystem, inside of an actor this should be the implicit ActorContext*/
class Parent(childMaker: ActorRefFactory => ActorRef) extends Actor {
  val child = childMaker(context)
  var ponged = false

  def receive = {
    case "ping" => child ! "ping"
    case "pong"   => ponged = true
  }
}*/