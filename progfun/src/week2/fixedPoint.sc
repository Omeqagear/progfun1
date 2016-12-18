import math.abs

object excersise{
  val tolerance = 0.001
  def isCloseEnough(x: Double, y: Double) =
    abs(x - y) / x < tolerance

  def fixedPoint(f: Double => Double)(firtsGuess: Double)= {
    def iterate(guess: Double): Double={
      val next = f(guess)
      if(isCloseEnough(guess, next))next
      else iterate(next)
    }
    iterate(firtsGuess)
  }
  fixedPoint(x => 1+ x/2)(1)

  //With this function we can obtain the average of the parameteers that we need in the sqrt()
  def averageDamp(f: Double => Double)(x: Double)= (x +f(x))/2

  // In this function we have to obtain the average of x and y,
  // Otherwise we going to get an infinite computation in the function
  def sqrt(x: Double)= fixedPoint(averageDamp(y =>  x / y))(1.0)
  sqrt(2)


}