package scala.codeChallange

object LanguageDetection {

  def detectLangage(s: List[String]): String = {

    if(s.contains("le")  || s.contains("Ja") || s.contains("les")
      || s.contains("un") || s.contains("une") || s.contains("jen")) "French"

    else if(s.contains("der") || s.contains("das") || s.contains("die")
      || s.contains("dem") || s.contains("ein") || s.contains("des")) "German"

    else if(s.contains("el") || s.contains("los")
      || s.contains("las") || s.contains("una") || s.contains("unos")) "Spanish"

    else "English"

  }

  def main(args: Array[String]) {
    import java.io.{BufferedReader, InputStreamReader}
    val in = new BufferedReader(new InputStreamReader(System in))
    val input = in readLine

    println(detectLangage(input.toLowerCase.split(" ").toList))
  }
}
