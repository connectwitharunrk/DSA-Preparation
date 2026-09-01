// Finding odd digits in the number

fun main() {

	var number = 76582
	
	while(number > 0) {
		val reminder = number % 10
	
		if(reminder % 2 != 0) {
			println(reminder)
		}
		
		number /= 10
	}

}