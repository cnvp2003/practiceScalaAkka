/**
  * Created by pati80 on 1/17/18.
  */

case class Node(next: Node, data: Int)

class LinkedList {
  var head:Node = null

  def append(data: Int)= {
    if(head == null) {
      //head1 = new Node(1)
    } else {
      var current:Node = head
      while(current.next != null){
        current = current.next
      }
      //current.next = new Node1(1)
    }
  }

  def prepend(data: Int) = {
    /*var newHead = new Node(1)
    newHead.next = head
    head = newHead*/
  }
}


/// Functional way of implementing Linked List
sealed trait ScalaLinkedList[+E]

case class Node1[+E](head1: E, tail: ScalaLinkedList[E]) extends ScalaLinkedList[E]
//case class Node2[+E](head: E, tail: Node2[E])

case object Empty extends ScalaLinkedList[Nothing]

//val n1 = Node1(1, Empty)
//val n2 = Node1(2, n1)

object ScalaLinkedList {

  def apply[E]( items : E* ) : ScalaLinkedList[E] = {
    if (items.isEmpty) {
      Empty
    } else {
      Node1( items.head, apply(items.tail : _*) )
    }
  }
}

// example to use it...
//ScalaLinkedList(1, 2, 3, 4)
