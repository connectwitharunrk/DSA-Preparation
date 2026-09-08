// Week 4
// Sum of all Primes in a given range

/**

Input : L = 10, R = 20
Output : Sum = 60
Prime numbers between [10, 20] are:
11, 13, 17, 19
Therefore, sum = 11 + 13 + 17 + 19 = 60
Input : L = 15, R = 25
Output : Sum = 59

Note: Use sieve of eratosthenes to solve the problem

*/

fun main() {

	val L = 15
	val R = 25
	val isPrime = BooleanArray(R + 1) { true }
	
	isPrime[0] = false
	isPrime[1] = false

	for(i in 2..Math.sqrt(R.toDouble()).toInt()) {
		if(isPrime[i]) {
			var multiple = i * i
			
			while(multiple <= R) {
				isPrime[multiple] = false
				multiple += i
			}
		}
	}
	
	var sum = 0
	
	for(i in L..R) {
		if(isPrime[i]) sum += i
	}
	
	println("sum: $sum")

}