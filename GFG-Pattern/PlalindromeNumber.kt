// Palindrome number
 
fun main() {
 
	val n = 563265
	var sum = 0
    var number = n
	while(number > 0) {
		val reminder = number % 10
		sum = (sum * 10) + reminder
		number /= 10
	}
    
    if(sum == n) println("Is palindrome")
    else println("Its not palindrome")
	
 }