/**
Week 4
Sieve of Eratosthenes
https://www.geeksforgeeks.org/problems/sieve-of-eratosthenes5242/1

Just remember:

Sieve of Eratosthenes = Find a prime → cross out its multiples → move to the 
				next number → remaining numbers are prime.

*/


fun main() {
    val n = 10

    val isPrime = BooleanArray(n + 1) { true }

    if (n >= 0) isPrime[0] = false
    if (n >= 1) isPrime[1] = false

    for (i in 2..kotlin.math.sqrt(n.toDouble()).toInt()) {
        if (isPrime[i]) { // Find a prime
            var multiple = i * i

            while (multiple <= n) {
                isPrime[multiple] = false // cross out its multiples
                multiple += i // move to the next number
            }
        }
    }

    for (i in 2..n) {
        if (isPrime[i]) {
            print("$i ") // remaining numbers are  prime.
        }
    }
}