//count Odd and Even

fun main() {
	
	val array = intArrayOf(1, 2, 3, 4, 5)
	var oddCount = 0
	var evenCount = 0
	for(i in 0 until array.size) {
		if(array[i] % 2 == 0) evenCount++
		else oddCount ++
	}
	
	println("Odd: $oddCount --- Even: $evenCount")
	
}