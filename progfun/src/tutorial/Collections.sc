import scala.collection.mutable

val seq = Seq(1, 2, 3, 4, 5)
seq.isEmpty
seq.nonEmpty
seq.contains(6) // JS Array.indexOf(6) == -1
seq.forall(x => x > 0) // JS Array.every()
seq.exists(x => x % 3 == 0)  // JS Array.some()
seq.find(x => x > 3)  // JS Array.find()
seq.head
seq.tail
seq.last
seq.init
seq.drop(2)
seq.dropRight(2)
seq.count(x => x < 3)
seq.groupBy(x => x % 2)
seq.sortBy(x => -x)
seq.partition(x => x > 3)
seq :+ 6
seq ++ Seq(6, 7)  // JS Array.concat()