
object GroupBy {

  case class Person(name:String, dept:Int)

  def main(args: Array[String]): Unit = {
    val p1 = Person("abcd", 2)
    val p2 = Person("efgh", 2)
    val p3 = Person("oijk", 3)
    val p4 = Person("xyzz", 4)
    val p5 = Person("xyzz", 2)

    val pList = List(p1, p2, p3, p4, p5)

    //println(s"Personss :=> ${pList.groupBy(_.dept)}")
    //println(s"Personss :=> ${pList.groupBy(_.name)}")

    val aa = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

    println(s"Disctinc ${aa.distinct}")
    println(s"unique ${aa.toSet}")
    println(s"duplicate ${duplicate(aa)}")


  }

  def duplicate[T](elements:List[T]):List[T] = {
    elements match {
      case Nil => elements
      case head::tail => head :: duplicate(tail filterNot (_==head))
    }
  }
}