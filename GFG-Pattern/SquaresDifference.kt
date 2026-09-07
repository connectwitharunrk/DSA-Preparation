// Squares Difference
// https://www.geeksforgeeks.org/problems/squares-difference0939/1
/**
Input: n = 2
Output: 4 
Explanation: abs|(1² + 2²) - (1 + 2)²| = 4.
Input: n = 3
Output: 22
Explanation: abs|(1² + 2² + 3²) - (1 + 2 + 3)²| = 22.

*/

import kotlin.math.abs

fun main() {

    val n = 2

    var sumOfSquares = 0
    var sum = 0

    for (i in 1..n) {
        sumOfSquares += i * i
        sum += i
    }

    println(abs(sumOfSquares - sum * sum))
}


fun main() {
	
	val n = 3
	val sum = n * (n + 1) / 2
	val sumOfSquares = n * (n + 1) * (2*n + 1)/6
	val result = abs(sumOfSquares - sum * sum)
	println(result)
}