/**

Find the total number of digits
*/

fun main() {
	var number = 859
	 
	var result  = 0
	while(number > 0) {
		val division = number % 10
		number = number / 10
		result = result + division
	}
	print(result)
}