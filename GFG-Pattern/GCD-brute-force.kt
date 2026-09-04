// GCD of number

fun main() {
	val a = 12
	val b = 18
	
	val result = if(a > b) gcd(b, a)
				else gcd(a, b)
	println(result)
}

fun gcd(a: Int, b: Int): Int {
	var gcdValue = 1
	for(i in 1..a) {
		if(a % i == 0 && b % i == 0)
			gcdValue = i
	}
	return gcdValue
}