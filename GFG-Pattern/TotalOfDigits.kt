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


fun main() {
	var number = 3435
	 
	var count = 0
	while(number > 0) {  
        val firstNumber = number
		number = number / 10
        if(number == 0) println("firstNumber: $firstNumber") // finding first number
        println("Number: $number")
        count ++
	} 
    println("Number of digits: $count")
}