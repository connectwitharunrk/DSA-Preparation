// Special series sum

// 1 + (1+2) + (1+2+3)+ (1+2+3+4).... + (1+2+3+4+..+n)

fun main() {
	
	val n = 5
	
	var sum = 0
	var seriesSum = 0
	
	for(i in 1..n) {
		sum += i
		seriesSum += sum
	}
	
	println(seriesSum)
	
}