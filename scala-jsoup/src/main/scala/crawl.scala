import org.jsoup._
import collection.JavaConverters._

object crawl {
  def main(args: Array[String]) {
    try {
      val urlstr = "http://search.yahoo.co.jp/search?p=scala"
      val doc = Jsoup.connect(urlstr).get
      val tag = doc.select("#res > #web > ol > li").asScala.head
      println(tag)
    } catch {
       case e : NoSuchElementException  => println("NO TAG")
    }
  }
}
