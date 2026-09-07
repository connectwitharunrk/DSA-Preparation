// Week 4
// largest in Array
// https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1

fun main() {

	val array = intArrayOf(1, 8, 7, 56, 90)
	
	var largestValue = array[0]
	
	for(i in 1 until array.size) {
		if(largestValue < array[i]) {
			largestValue = array[i]
		}
	}
	
	println("largestValue: $largestValue")

}