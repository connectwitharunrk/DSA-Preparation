// week 4
// power of number

fun main() {

	val result = powerOfNumber()
	print(result)
}

fun powerOfNumber(number: Int, power: Int): Int {
	if(power == 0) return 1
	result number * powerOfNumber(number, power - 1)
}