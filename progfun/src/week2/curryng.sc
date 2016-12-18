object curryng{
  def sum(f: Int => Int):( Int, Int) => Int ={
    def sumF(a: Int, b: Int): Int ={
      if(a > b) 0
      else f(a) + sumF(a + 1, b)
    }
    sumF
  }
  def cube(x: Int): Int = x * x * x

  sum(cube) (1,10)
}