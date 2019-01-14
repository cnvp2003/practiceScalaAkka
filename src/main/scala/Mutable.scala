import scala.collection.immutable.TreeMap
import scala.collection.mutable

/**
  * Created by pati80 on 9/14/17.
  */
object Mutable {

  def countWords(text: String) = {
    val counts = mutable.Map.empty[String, Int]
    for (rawWord <- text.split("[ ,!.]+")) {
      val word = rawWord.toLowerCase
      val oldCount =
        if (counts.contains(word)) counts(word)
        else 0
      counts += (word -> (oldCount + 1))
    }
    counts
  }

    def main(args: Array[String]): Unit = {
      println(s" count => ${countWords("See Spot run! Run, Spot. Run!")}")

      var tm = TreeMap(3 -> 'a', 1 -> 'c', 4 -> 'x')
      println(s"Tree Map => $tm")

    }


}

 /*/// out put
countWords("See Spot run! Run, Spot. Run!")
res22: scala.collection.mutable.Map[String,Int]
= Map(see -> 1, run -> 3, spot -> 2)*/