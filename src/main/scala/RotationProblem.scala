import Array._

class RotationProblem(list: List[Int], maxAllowedVisitCount: Int) {
  val numberOfElement = list.size
  var visitCount = 0
  var index = 0

  def rotate: scala.collection.mutable.Map[Int, Int] = {
    var visitMap = scala.collection.mutable.Map[Int, Int]()
    var loopCount = 0
    while( visitCount <= maxAllowedVisitCount ){
      val element = list(index)
      checkVisited(visitMap, element)

      if(visitCount < visitMap(element)) visitCount = visitMap(element)

      shift(element)

      println(s"$visitMap :: LoopCount $loopCount")
      loopCount+=1
    }
    visitMap
  }

  def checkVisited(visitMap: scala.collection.mutable.Map[Int,Int], element:Int): Unit ={
    visitMap += visitMap.get(element).map(x => element -> (x + 1)).getOrElse(element -> 1)
  }
  def isEven(elem: Int): Boolean = elem %2 == 0

  def shiftLeft() {index -=2; if(index<0) index = index + numberOfElement}
  def shiftRight (){index = (index +3)% numberOfElement }

  def shift(element :Int ):Unit ={
    if(isEven(element)) shiftLeft() else shiftRight //Odd/Even separation
  }
}

object RotationProblem {
  val elementList = List(1, 2, 3, 4, 5)

  def main(args: Array[String]) {
    val rotationProblem = new RotationProblem(elementList, 3)
    rotationProblem.rotate
  }
}