/**
	Print the Kth Digit
	Given two numbers a and b, find kth digit from right of ab.
	
	https://www.geeksforgeeks.org/problems/print-the-kth-digit3520/1
	
	Example 1:

	Input: a = 3, b = 3, k = 1
	Output: 7
	Explanation: 33 = 27 and 1st digit from right is 7
	Input: a = 5, b = 2, k = 2
	Output: 2
	Explanation: 52 = 25 and second digit from right is 2.
	
*/


fun main() {
	val a = 3
	val b = 3
	val k = 1
	
	var actualValue = 1
	for(i in 1..b) {
		actualValue *= actualValue
	}
	var count = 1 
	while(actualValue > 0) {
		val reminder = actualValue % 10
		if(k == count) {
			println(reminder)
			return
		}
		actualValue /= 10
		count ++
	}
}

	
Soltution 2:
-----------

fun main() {

    val a = 5
    val b = 2
    val k = 2

    var number = Math.pow(a.toDouble(), b.toDouble()).toLong()

    repeat(k - 1) {
        number /= 10
    }

    val result = number % 10

    println("Result: $result")
}
	
	