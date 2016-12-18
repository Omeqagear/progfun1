package week2

/**
  * Created by Administrador on 26/11/2016.
  */

object rational{

  val x = new Rational(1,3)
  val y = new Rational(5,7)
  val z = new Rational(3,2)

  x - y - z

  y + y
  x - y
  x max y
  x < y
  new Rational(2)
  y * z

  x + 2
  y * 2
  !x
}

class Rational(x: Int, y: Int){

  def this(x: Int) = this(x, 1)
  require( y != 0 , "Denominator must be nonzero")

  private def gcd(a: Int, b: Int): Int = if(b ==0) a else gcd(b, a % b)

  private val numer = x
  private val denom = y


  def < (that: Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) = if(this < that)that else this



  def + (that: Rational) ={
    new Rational(
      this.numer * that.denom + that.numer * this.denom,
      this.denom * that.denom
    )
  }

  def - (that: Rational)= this + -that

  def * (that: Rational) ={
    new Rational(
      this.numer * that.numer,
      this.denom * that.denom
    )
  }

  def / (that: Rational) = this * !that


  def unary_- : Rational = new Rational(-numer, denom)

  def unary_! : Rational = new Rational(denom, numer)

  def + (that: Int): Rational = this + new Rational(that)

  def - (that: Int): Rational = this - new Rational(that)

  def * (that: Int): Rational = this * new Rational(that)

  def / (that: Int): Rational = this / new Rational(that)

  override def  toString={
    val g = gcd(numer, denom)
    numer / g + "/" + denom / g
  }
}


