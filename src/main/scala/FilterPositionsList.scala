import scala.collection.immutable.Seq
object Solution {
  def f(arr:List[Int]):List[Int] = {
    /** solution 1 **/
    val j: Seq[Int] = for(i <- 1 until arr.size by 2) yield i
    val aa: List[Int] = j.map(j => arr(j)).toList
    println("j",aa)

    /** solution 2 **/
    val x =arr.indices.collect { case i if i % 2 != 0 => arr(i)}.toList
    println("x",x)

    /** solution 3 **/
    for(i <- 0 until arr.size if i%2 !=0) yield ( println("now i:",arr(i)))

    /** solution 4 **/
    for(a<- arr.zipWithIndex if (a._2 % 2  != 0))yield {
      println(a._1)
      a._1
    }
  }


  def main(args: Array[String]): Unit = {
    f(List(2, 33, 45, 67, 78))
  }
}