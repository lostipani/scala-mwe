trait Iterator[A]:
    def hasNext: Boolean
    def next(): A

class IntIterator(max: Int) extends Iterator[Int]:
    private var current = 0
    override def hasNext: Boolean = current < max
    override def next(): Int = 
        if hasNext then
            val t = current
            current += 1
            t
        else
            0
end IntIterator

@main def main() =
    val N: Int = 4
    val iterator = IntIterator(N)
    for iter <- 1 to (N+1)
    do
        println(iterator.next())
