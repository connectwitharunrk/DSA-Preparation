// GCD of number

fun main() {
	var a = 18
	var b = 12
	
	while(b != 0) {
		val reminder = a % b
		a = b
		b = reminder
	}
				
	println(a)
}