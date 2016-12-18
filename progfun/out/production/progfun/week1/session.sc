object session{

  def abs(x:Double) = if(x > 0) x else -x

  def sqrt(x: Double) = {
    def sqrtIter(guess:Double, x: Double):Double =
      if(isGoodEnaugh(guess, x)) guess
      else sqrtIter(improve(guess,x),x)


    def isGoodEnaugh(guess: Double, x: Double) =
      abs(guess * guess - x) / x < 0.001

    def improve(guess: Double, x: Double) =
      (guess + x / guess) / 2


    sqrtIter(1.0, x)
  }



  val x : Double = sqrt(0.1e-20)
  sqrt(1.0e20)
  sqrt(1.0e50)
  sqrt(0.001)


}
