package scalabook

/**
  * Created by Administrador on 27/11/2016.
  */
object ForExpres {
  import java.io.File

  // Iteration in a List object and printing in the console each element
  val filesHere= new File(".").listFiles

  for (file <- filesHere)
    println(file)

  // You con ad conditionals for the iteration of and iterable
  for {
    file <- filesHere
    if file.isFile
    if file.getName.endsWith(".exe")
  } println(file)

  for (i<- 1 to 100)yield {
    if(i % 3 == 0) println("Fizz")
      if(i % 5== 0) println("FizzBuzz")
    else if(i % 5== 0) println("Buzz")
      if(i % 3 == 0) println("FizzBuzz")
    else println(i)
  }

  val someList = List(-3,-2,-1,0,1,2,3,4,5)
  // Add one by one the elements of a List object
  def sumList(xs: List[Int]): Int ={
    if(xs.isEmpty) 0
    else xs.head + sumList(xs.tail)
  }

  sumList(someList)
  var sum = 0


}
