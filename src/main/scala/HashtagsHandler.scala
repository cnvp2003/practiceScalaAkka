package scala.codeChallange

object HashtagsHandler {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var arr = new Array[String](n);
    for (arr_i <- 0 to n - 1) {
      arr(arr_i) = sc.nextLine();
    }

    import scala.io.Source

    val html = Source.fromURL("https://s3.amazonaws.com/hr-testcases/479/assets/words.txt")
    val source = html.mkString.split("\n").toList

    def checkForWord(word: String, source: List[String]): Option[String] = {
      if(source.contains(word)){
        Some(word)
      }   else None
    }

    def processHashTag(string: String): List[String] = {
      val wordList =  List[String]()
      for (i <- 1 to string.size) {
        val a = string.splitAt(i)
        checkForWord(a._1, source).map { x =>
          println("sssaaaaaaaaaaaaaa", x)
          (x :: wordList).toList
        }
      }
      print(wordList)
      wordList
    }

    arr.map(processHashTag)
  }
}
