package scala.codeChallange

object HeightProblem {

  def main(args: Array[String]): Unit = {
  val array = uniqueValue(3,Array(1,1,0))
    array.map(print)
  }
  def uniqueValue(input1: Int, input2: Array[Int]): Array[Int] = {

    val outPutArray = new Array[Int](input1)
    input2 map {
      case 1 => {if (outPutArray(1) == 2) outPutArray(input1-1) = 3 else outPutArray(1) = 2}
      case 2 => outPutArray(2) = 1
      case 0 => outPutArray(0) = 4
    }
    outPutArray
  }
}
