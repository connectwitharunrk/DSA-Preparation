// Write a program that gets n as input and print all the prime numbers till that number.


fun main() {
	
	val n = 5
	
	for(number in 2..n) {
		var isPrime = true
	
		for(i in 2 until number) {
			if(number % i == 0) {
				isPrime = false
				break
			}
		}
		
		if(isPrime) println(number)
		
	} 
}