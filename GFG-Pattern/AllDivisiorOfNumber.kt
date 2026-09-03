/**

All Divisors of a Number

https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1


*/


fun main() {
	
	val n = 21191
	
	for(i in 1..n) {
        if(n % i == 0) {
            println(i)
        }
	}
}