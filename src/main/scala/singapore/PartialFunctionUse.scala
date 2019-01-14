package singapore

object PartialFunctionUse {
  def main(args: Array[String]) {
    println(List(3, 2, 1, 0).map {
      case n: Int if (n != 0) => 42.0 / n
      case 0 => 0
    })
    //List(3, 2, 1, 0).map { case n: Int if (n != 0) => 42.0 / _ }
    println(List(3, 2, 1, 0).collect { case n: Int if (n != 0) => 42.0 / n })
  }
}