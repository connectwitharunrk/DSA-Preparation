// https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
// Sum of Natural Number Cubes

import kotlin.math.pow

fun main() {

	val n = 5
	var sum = 0
	
	for(i in 1..n) {
		sum += i.toDouble().pow(3.toDouble()).toInt()
	}
	
	println(sum)

}