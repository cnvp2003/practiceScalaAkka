package scala.codeChallange

object Test1 {
  def main(args: Array[String]) {

    println("result",passCount(5,3,2))
  }

  def passCount(input1: Int, max: Int, shift: Int): Int = {

    //Write code here

    var totalCount = -1

    if(input1 >= 3 && max <= 1000) {
      val list = (1 to input1).toList
      var map: Map[String, Int] = Map()

      val firstValue = list(0)
      val startValue = list(firstValue + shift)
      map += (firstValue.toString -> 1)
      map += (startValue.toString -> 1)

      var nextNode = getNextNode(startValue, shift, list)

      var value = map.get(nextNode.toString).getOrElse(0)

      while (value != max) {
        value = map.get(nextNode.toString).getOrElse(0)
        value += 1
        map += (nextNode.toString -> (value))
        if(value != max)
        nextNode = getNextNode(nextNode, shift, list)
      }
      println(map)
      for ((k, v) <- map) {
        totalCount += v
      }

      totalCount
    }
    else -1
  }

  def shiftLeft(i: Int, list: List[Int], shift: Int) = {
    i match {
      case i if(i - shift == 0) => list(list.size -1)
      case _ => list(i - shift -1)
    }
  }

  def shiftRight(i: Int, list: List[Int], shift: Int) = {
    i match {
      case i if(i + shift > list.size) => list(shift)
      case i if(i + shift == list.size) => list(0)
      case _ => list(i + shift)
    }
  }

  def getNextNode(node: Int, shift: Int, list: List[Int]) = {
    node match {
      case node if(node % 2 == 0) => shiftLeft(node, list, shift)
      case _ => shiftRight(node, list, shift)
    }
  }
}
