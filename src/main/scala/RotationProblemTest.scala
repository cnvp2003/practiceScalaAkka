import Array._

object RotationProblemTest {
/*  def main(args: Array[String]) {
    //val elets = List(1, 3, 4, 2, 9)
    val elets = List(2, 4, 3, 5, 8)
    val numberOfElement = elets.size
    var visitMap = Map[Int, Int]()
    var loopCount = 0
    val highestVisitCount = 3
    var visitCount = 0
    var i = 0

    while( visitCount <= highestVisitCount ){
      val aa = elets(i)

      visitMap += visitMap.get(aa).map(x => aa -> (x + 1)).getOrElse(aa -> 1)
      if(visitCount < visitMap(aa)) visitCount = visitMap(aa)

      if(aa%2 == 0) i = i-2 else i += 3 //Odd/Even separation
      if(i<0) i += numberOfElement
      if(i >= numberOfElement) i -= numberOfElement

      println(s"$visitMap value : ${visitMap(aa)} :: LoopCount $loopCount")
      loopCount+=1
    }
  }*/


  def main(args: Array[String]) {
    //val elets = List(1, 3, 4, 2, 9)
    val elets = List(2, 4, 3, 5, 8)
    val numberOfElement = elets.size
    var loopCount = 0
    var current = 5
    var targeted = 2


    val currentIndex = elets.indexOf(current)
    val targetedIndex = elets.indexOf(targeted)

    if (currentIndex > targetedIndex) {
      val diff = currentIndex - targetedIndex
      val dif1 = ((elets.length - currentIndex) + targetedIndex - 0)

      if(diff < dif1) print(s"value ${diff}") else print(s"value ${dif1}")

    } else {
      val diff = targetedIndex - currentIndex
      val dif1 = ((elets.length - targetedIndex) + currentIndex - 0)

      if(diff < dif1) print(s"value ${diff}") else print(s"value ${dif1}")
    }

  }

}