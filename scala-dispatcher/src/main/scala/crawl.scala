import dispatch._
import dispatch.Defaults._

object crawl {
  def main(args: Array[String]) {
    try {
      val req = url("http://search.yahoo.co.jp/search?p=scala")
      val res = Http(req OK as.String)
      val r = res()
      println(r)
    } catch {
       case e : NoSuchElementException  => println("NO TAG")
    }
  }
}
