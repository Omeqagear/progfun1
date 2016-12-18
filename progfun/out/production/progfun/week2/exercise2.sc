object exercise2{
  def sum(f : Int => Int,a: Int, b: Int): Int ={
    def loop(a: Int, acc: Int = 0): Int ={
      if(a > b) acc
      else loop(a + 1, f(a) + acc)
    }
    loop(a)
  }
  sum((x) => x * x * x, 2, 3)
}