package week3

/**
  * Created by Administrador on 26/11/2016.
  */
object nth {

  def nth[T](n: Int, xs: List[T]): T = {
    if (n == 0) xs.head
    else nth(n - 1, xs)

  }
}