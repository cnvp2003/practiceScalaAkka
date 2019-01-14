package scala.codeChallange

object WordISD {
  def main (args: Array[String]) {
      println(solution("Form", "Form"))
      println(solution("absced", "fdfsddf"))
  }

  def solution(input1: String, input2: String): String = {
    val firstWord: Array[Char] = input1.toCharArray
    val secondWord = input2.toCharArray
    val newFirstWord: Array[Char] = new Array[Char](secondWord.length)
    input2.length - input1.length match {
      case 0 => {
        if(input1.equalsIgnoreCase(input2))
          "NOTHING"
        else{
          var index = 0
          for(i <- 0 to input1.length -1) {
            if (firstWord(i) != secondWord(i)) {
              newFirstWord(i) = secondWord(i)
              index = i
            }else{
              newFirstWord(i) = firstWord(i)
            }
          }
            val newWord = newFirstWord.mkString("")

            if(newWord.equalsIgnoreCase(input2))
             "SWAP " + firstWord(index - 1) + " " + firstWord(index)
            else
              "IMPOSSIBLE"

        }
      }
      case 1 => {
        val new1 = new Array[Char](secondWord.length)
        for(i <- 0 to input1.length -1) {
          if (firstWord(i) == secondWord(i)) {
            new1(i) = firstWord(i)
          }
        }

        if(new1.nonEmpty) {
          for(i <- 0 to input2.length -1) {
            if (new1(i) != secondWord(i)) {
              new1(i) = secondWord(i)
            }
          }
        }

        println(new1.mkString(""))

          if(new1.mkString("").equalsIgnoreCase(input2))
            "INSERT"
        else "IMPOSSIBLE"
      }
      case _ => "IMPOSSIBLE"
    }
  }
}
