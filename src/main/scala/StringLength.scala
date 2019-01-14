/**
  * Created by pati80 on 13/12/2018.
  */
object StringLength {

  def main(args: Array[String]): Unit = {
    lengthBuiltin(List(1, 1, 2, 3, 5, 8))
    lengthRecursive(List(1, 1, 2, 3, 5, 8))
    lengthTailRecursive(List(1, 1, 2, 3, 5, 8))
    lengthFunctional(List(1, 1, 2, 3, 5, 8))
  }


  // Builtins.
  def lengthBuiltin[A](ls: List[A]): Int = ls.length

  // Simple recursive solution.
  def lengthRecursive[A](ls: List[A]): Int = ls match {
    case Nil       => 0
    case _ :: tail => 1 + lengthRecursive(tail)
  }

  // http://blog.richdougherty.com/2009/04/tail-calls-tailrec-and-trampolines.html
  def lengthTailRecursive[A](ls: List[A]): Int = {
    def lengthR(result: Int, curList: List[A]): Int = curList match {
      case Nil       => result
      case _ :: tail => lengthR(result + 1, tail)
    }
    lengthR(0, ls)
  }

  // More pure functional solution, with folds.
  def lengthFunctional[A](ls: List[A]): Int = ls.foldLeft(0) { (c, _) => c + 1 }

}
