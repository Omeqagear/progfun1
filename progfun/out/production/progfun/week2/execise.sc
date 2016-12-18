object highOrdFun{
  def sumInts(a: Int , b: Int): Int=
    if (a > b) 0 else a + sumInts(a + 1, b)



  def sumCubes(a: Int, b: Int): Int =
    if(a > b) 0 else cube(a) + sumCubes(a+1, b)



  def sumFactorials(a: Int,b: Int ):Int =
    if(a > b) 0 else fact(a) + sumFactorials(a + 1, b)

  def cube(x: Int): Int = x * x * x

  def fact(x: Int): Int = if(x == 0) 1 else fact(x - 1)

  def id(x: Int): Int = x

  def sum(f: Int => Int,a: Int , b: Int): Int=
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)





  sumInts(1,2)
  sumCubes(2,3)
  sumFactorials(7,8)

  sum(id, 1,2)
  sum(cube, 2,3)
  sum(fact, 7,8)

}