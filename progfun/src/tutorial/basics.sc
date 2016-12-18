import scala.util.Random





def mul(x: Double, y: Double): Double = x * y

val f = (x: Int, y: Int) => x + y

val p = Array("Fox", "jumped", "over", "me")

// Return the sum of the length of all the elements of the array
val l = p.map(s => s.length).sum

def sumList(xs: List[Int]): Int =
  if(xs.isEmpty) 0
  else xs.head + sumList(xs.tail)

// variable number of parameters
def sum(args: Double*): Double={
    args.sum
}

val s = sum(5,2,3,4,5)







val name = "Edwuin"

val res = if(name == "") 0 else 1

//for expresion

var x = 0

for(i <- 0 until 100)
  x += i * i

val y = x

for(s <- p){
  println(s"Word $s")
}

def foundPairs(n: Int, sum: Int): Unit ={
  for{
    i <- 0 until n
    j<- i until n if i + j == sum
  }println(s"Found pairs $i, $j")
}

foundPairs(20,31)






val animal = "Alien"

val description = animal match {
  case "Cat"|"Tiger"|"Lion" =>
    "It is a feline"
  case "Dog"| "Wolf"|"Fox" =>
    "It is a canine"
  case _ =>
    "What in the world is that?"
}





abstract class Shape( var x: Int, var y : Int){
  def move(dx: Int, dy: Int): Unit ={
    x += dx
    y += dy
  }

  def draw(): Unit = println(s"Shape at $x, $y")
}

class Circle(x: Int, y: Int, val r: Int) extends Shape(x,y){
  override def draw(): Unit = println(s"Circle at $x, $y, with a radius of $r")
}

trait Clickable {
  def onClick(): Unit = println("Cliked")

}

class ClickableCircle(x: Int, y: Int, r: Int) extends Circle(x,y,r) with Clickable

val cc = new ClickableCircle(0,0,42)
cc.onClick()
val c = new Circle(5,5,42)
val r = c.r





case class Person(first: String, last: String)

val person = Person("James", "Bond")

object RandomGen {
  private def privateMethod(): Unit = {
    println("I am private")
  }

  private val rnd = new Random()

  def publicMethod(): Unit = {
    println("The public can see me!")
    privateMethod()
  }

  val name = "RandomGen"

  def getRandomNumber: Double = rnd.nextDouble()
}

val rand = RandomGen.getRandomNumber


