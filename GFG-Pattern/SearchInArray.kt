// Week 4

// Array Search
// https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1
fun main() {

	val array = intArrayOf(1, 2, 3, 4)
	val x = 3
	var index = -1
	
	for(i in 0 until array.size) {
		if(array[i] == x) {
			index = i
			break
		}
	}
	
	println("$x position is: $index")

}