// Prime number

// If a number is divisible only by 1 and itself, it is prime.

fun main() {

	val number = 7
	var isPrime = true
	
	if(number <= 1) {
		isPrime = false
	} else {
	
		for(i in 2 until number) {
			if(number % i == 0) {
				isPrime = false
				break
			}
		}
	
	}
	  
    println(if(isPrime) "Is Prime" else "Its not a prime")

}