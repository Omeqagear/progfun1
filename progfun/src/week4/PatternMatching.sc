

trait Expr

case class Number(n: Int) extends Expr

case class Sum(e1: Expr, e2: Expr) extends Expr

case class Prod(f1: Expr, f2: Expr)extends Expr

case class Var(n: Expr) extends Expr

def eval(e: Expr): Int = e match {
  case Number(n) => n
  case Sum(e1,e2) => eval(e1) + eval(e2)
  case Prod(f1,f2) => eval(f1) * eval(f2)
}

def show(e: Expr): String = e match {
  case Number(n) => n.toString
  case Sum(e1, e2) => show(e1) + "+" + show(e2)
  case Prod(f1, f2) => show(f1) + "*" + show(f2)
}

val n = Number(3)

val s = Sum(Prod(Number(2), Number(5)), Prod(Number(4), Number(5)))

val p = Prod(Number(2), Number(5))

eval(n)
eval(s)
eval(p)

show(n)
show(s)
show(p)