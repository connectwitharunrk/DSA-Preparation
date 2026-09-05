// Reverse Digits
// https://www.geeksforgeeks.org/problems/reverse-digit0316/1

fun main() {

	var n = 1203450 
	var reversed = 0
	while(n > 0) {
		val reminder = n % 10 
        reversed = reversed * 10 + reminder
		n /= 10 
	}
 
 	println(reversed)
}