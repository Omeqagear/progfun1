package scalabook
import java.io.File

object clojure{
  def main(args: Array[String]): Unit = {

    val more = 9999

    val addMore = (x: Int)=> x + more

    addMore(10)

    val someList = List(-3,-2,-1,0,1,2,3,4,5)

    var sum = 0

    someList.foreach(sum += _)

    sum

    def containsZero(nums: List[Int]): Boolean = nums.contains(0)


    containsZero(someList)

    someList.filter(_ < 0)

  }
}
object FileMatcher{
  private def filesHere = new File(".").listFiles

  private def filesMatching(matcher: String => Boolean)=
    for(file <- filesHere; if matcher(file.getName))
      yield file

  def filesEnding(query: String)=
    filesMatching(_.endsWith(query))

  def filesContaining(query: String)=
    filesMatching(_.contains(query))

  def filesRegex(query: String)=
    filesMatching(_.matches(query))
}

