
def factorial1(n: Int): Int =
  if(n == 1) 1 else n * factorial1(n - 1)

def factorial2(n: Int): Int ={
  def fact_iter(product: Int, counter: Int, max_count: Int): Int =
    if(counter > max_count) product
    else fact_iter(product*counter, counter + 1, max_count)
  fact_iter(1,1,n)
}

factorial1(6)
factorial2(6)