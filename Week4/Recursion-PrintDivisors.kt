// week 4 
// print divisors of number

fun main() {
	printDivisor(12)
}

fun printDivisor(number: Int, next: Int = 1) {
	if(next >= number) return
	
	if(number % next == 0) println(next)
	printDivisor(number, next + 1)
}