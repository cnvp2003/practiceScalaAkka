package scala.codeChallange

import scala.io.Source

object MissingApostrophes {

  def replaceApostrophy(listOfString: List[String]) = {
    val html = Source.fromURL("https://s3.amazonaws.com/hr-testcases/479/assets/words.txt")
    val source = html.mkString.split("\n").toList
    val wordsWithEndingS = listOfString.filter(_.endsWith("s")).map {
      word =>
        word.take(word.lastIndexOf("s"))
    }
    wordsWithEndingS.filter(source.contains(_)).map(_ + "s").toSet.filter(x => x.ne("as") || x.ne("has"))
  }

  def main(args: Array[String]) {
    import java.io.{BufferedReader, InputStreamReader}
    val in = new BufferedReader(new InputStreamReader(System in))
    val input = in readLine

    val words = replaceApostrophy(input.toLowerCase.split(" ").toList)
    words.map {
      word => input.toString.replaceAll(word, (word.take(word.lastIndexOf("s")) + "'s"))
    }

    println(input)
  }
}
