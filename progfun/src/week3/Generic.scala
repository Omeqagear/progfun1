package week3

/**
  * Created by Administrador on 26/11/2016.
  */
object Generic {

}




trait List[T]{
  def isEmpty: Boolean

  def head: T

  def tail: List[T]
}


class Cons[T]( val head: T, val  tail: List[T])extends List[T]{
  def isEmpty = false
}


class Nil[T] extends List[T]{
  def isEmpty = true

  def head: Nothing = throw new NoSuchElementException("Nil.head")

  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}


