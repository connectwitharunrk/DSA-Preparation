// sum of array

fun main() {

	val array = intArrayOf(2,5,3,8,9,6)
	var sum = 0
	for(i in 0..array.size) {
		sum += array[i]
	}
	
	println(sum)

}