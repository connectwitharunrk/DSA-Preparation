// Find middle number

fun main() {

	val a = 15
	val b = 89
	val c = 10
	
	if((a > b && a < c) || (a < b && a > c)) println(a)
	else if((b > a && b < c) || (b < a && b > c)) println(b)
	else println(c)
	
}