import scala.collection.JavaConversions._
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium._

object crawl {
  def main(args: Array[String]) {
    try {
      val urlstr = "http://search.yahoo.co.jp/search?p=scala"
      val driver = new HtmlUnitDriver()
	  driver.get(urlstr)
	  var res = driver.findElementsByXPath("//li/a")
	  for(r <- res) {
		println(r)
	  }
	} catch {
       case e : NoSuchElementException  => println("NO TAG")
    }
  }
}
