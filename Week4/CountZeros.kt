// Week 4

// Count zero's in a number

solution 1: 

fun main() {
     
    var n = 2035900
    var count = 0
    while(n > 0) {
        val reminder = n % 10
        if(reminder == 0) count ++
        n /= 10
    }
    println(count)
}

Solution 2:

// using recursion


fun main() {
	
	val n = 12030
    println(countZeros(n))
}

fun countZeros(n: Int): Int {

	if(n == 0) return 0
	
	val digit = n % 10
	
	val count = if(digit == 0) 1 else 0
	
	return count + countZeros(n / 10)
}