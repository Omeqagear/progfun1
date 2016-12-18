
abstract class Nat{
  def isZero: Boolean

  def succesor: Nat = new Succ(this)

  def predecesor: Nat

  def + (that: Nat): Nat

  def - (that: Nat): Nat
}

object Zero extends Nat{
  def isZero: Boolean = true

  def predecesor: Nat = throw new Error("zero has no predecesor")
  def +(that: Nat): Nat = that

  def -(that: Nat): Nat = if(that.isZero) this else throw new Error("no predecessor")
}

class Succ(n: Nat) extends Nat{
  def isZero: Boolean = false

  def predecesor: Nat = n

  def + (that: Nat): Nat = new Succ(n +that)

  def -(that: Nat): Nat = if(that.isZero) this else n - that.predecesor
}



