package scalabook

/**
  * Created by Administrador on 27/11/2016.
  */
object Currying {
  def CurriedSum(x: Int)(y: Int) = x + y

  def first(x: Int) = (y: Int)=> x + y

  val second = first(1)

  val OnePlus = CurriedSum(1)_

  def main(args: Array[String]): Unit = {
    OnePlus(2)
    second(2)
  }
}
