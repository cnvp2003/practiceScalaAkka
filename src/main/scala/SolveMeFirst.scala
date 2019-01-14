
import org.jsoup.Jsoup
import org.jsoup.nodes.{Document, Element}
import org.jsoup.select.Elements

import scala.collection.immutable.TreeMap
import scala.collection.mutable

object SolveMeFirst {

  def main(args: Array[String]) {
      //println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
    //println(readLine().take(2).map(_.toInt).sum)
      val ss = Some("<h2>htest</h2>" +
        "<p>test</p>" +
        "<h2>hdsd</h2>" +
        "<p>dsd</p>" +
        "<ul>fdfds</ul>" +
        "<p>23432423</p>")

      case class abc(head: String, value: String)

      val recipients = mutable.MutableList.empty[abc]

      ss.map { c =>
        val doc = Jsoup.parse(c)

        val jj = doc.getElementsByTag("h2")
        val children: Elements = doc.body().children()

        for (i <- 0 until children.size()) {
          children.get(i) match {
            case e:Element if ("h2".equals(e.tagName)) => {
              children.get(i)
              println(s"head ${children.get(i)}")
            }
            case e:Element if (!"h2".equals(e.tagName())) => {
              children.get(i)
              println(s"text ${children.get(i)}")
            }
            case _ => println(s"dsdsd ${children.get(i)}")
          }

          /*if ("h2".equals(children.get(i).tagName())) {
            children.get(i)
            println(s"head ${children.get(i)}")
          } else {
            children.get(i)
            println(s"text ${children.get(i)}")
          }*/
        }
}

/*val doc = Jsoup.parse(ss.get)
val firstH1 = doc.select("h2").first()
val h2Text = firstH1.text()

val siblings: Elements = firstH1.siblingElements()*/

// val map = new TreeMap<String, List<Element>>()
//val elementsBetween = new ArrayList<Element>()

/*
for (i <- 0 until siblings.size()) {
val sibling = siblings.get(i)

System.out.println("sibling::: " + sibling)

if (! "h2".equals(sibling.tagName()) && i < siblings.size()-1) {
 //elementsBetween.add(sibling)
 println(s" ${i}iff ${sibling}")
} else {
 println(s"ELSEE ${sibling}")
 /*if(i==siblings.size()-1){
   //elementsBetween.add(sibling);
   println(s"ELSEE ${}")
 }
 System.out.println("elementsBetween::: " + elementsBetween.toString());
 map.put(h2Text, elementsBetween);
 System.out.println("map::: "+map);
 h2Text = sibling.text();
 //processElementsBetween(elementsBetween);
 elementsBetween = new ArrayList<Element>();*/
}
}*/




/* val childs = doc.childNodes().listIterator()
println(s"childsss ${childs}")
for (i <- 0 until jj.size()) {

 println(s" dsdas $i :: ${doc.childNodes().listIterator()}")
}*/

/*for (i <- 0 until jj.size()){

 recipients += abc(jj.get(i).text(), pp.get(i).text())
 println(s" jj firstfsdfs ${jj.get(i)}... ${pp.get(i)}")

 if(jj.get(i) == jj.last()){
   println(s"lastt ")
 }

 println(s" @@@@@ ${jj.last()}... ${pp.get(i)}")
}

recipients.map(x => println(s"FSDFSDF ${x}"))*/

}


}