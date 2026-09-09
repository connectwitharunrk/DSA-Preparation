// Week 4
// Sum of digits of a number

fun main() {
	val n = 342
	val result = sumOfDigit(n)
	println(result)
}

fun sumOfDigit(n: Int): Int {

	if(n <= 9) return n
	return (n % 10) + sumOfDigit(n / 10)
}