// Week 4
// Sum of n numbers using recursion

fun main() {
	val n = 5
    val sum = sumOfNnumbers(n)
    println(sum)
}

fun sumOfNnumbers(n: Int): Int {
    var sum = n
    if(n == 0) return 0
    sum += sumOfNnumbers(n - 1)
    return sum
}
 