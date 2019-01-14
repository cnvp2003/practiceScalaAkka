/**
  * Created by pati80 on 13/12/2018.
  */
object ParenthesisBalance {

  def main(args: Array[String]): Unit = {
    //val ss = "hello)goodbye(".toList
    val ss = "((())())".toList
    //val ss = "hello)goodbye(".toList
    println(s"OUTPUT: ${balance(ss)}")
  }

  def balance(chars: List[Char]): List[Char] = {
    def go(cs: List[Char], level: Int, list: List[Char]): List[Char] = cs match {
      case Nil => {
        level == 0
        list
      }
      case ')' :: _ if level < 1 => {
        false
        ')' :: list
      }
      case ')' :: xs => go(xs, level - 1,  ')' :: list)
      case '(' :: xs => go(xs, level + 1, '(' :: list)
      case _ :: xs => go(xs, level, list)
    }

    go(chars, 0, Nil)
  }

  def balance(chars:List[Char], level:Int=0): Boolean = {
    if (level < 0) return false

    val nextParen = chars.dropWhile(char => char != ')' && char != '(')
    if (nextParen.isEmpty) {
      level == 0
    } else if (nextParen.head == '(') {
      balance(nextParen.tail, level + 1)
    } else {
      assert(nextParen.head == ')')
      balance(nextParen.tail, level - 1)
    }
  }
}