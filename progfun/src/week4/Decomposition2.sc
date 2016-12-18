trait Expr{
  // Class Indicators
  def isNumber: Boolean
  def isSum: Boolean

  // Class Accesors
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr

}

class Number (n: Int) extends Expr{
  def isNumber: Boolean = true
  def isSum: Boolean = false

  def numValue: Int = n
  def leftOp: Expr = throw new NoSuchElementException
  def rightOp: Expr = throw new NoSuchElementException
}

class Sum(e1: Expr, e2: Expr) extends Expr{
  def isNumber: Boolean = false
  def isSum: Boolean = true

  def numValue: Int = throw new NoSuchElementException
  def leftOp: Expr = e1
  def rightOp: Expr = e2
}

def eval (e: Expr): Int ={
  if(e.isInstanceOf[Number]) e.asInstanceOf[Number].numValue
  else if(e.isInstanceOf[Sum]) eval(e.asInstanceOf[Sum].leftOp) + eval(e.asInstanceOf[Sum].rightOp)
  else throw new Error("Unknow Expression "+ e)
}

val n = new Number(5)

val s = new Sum(new Number(2),new Number(3))

eval(n)
eval(s)

