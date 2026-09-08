// Week 4
// Find element at a given index

// https://www.geeksforgeeks.org/problems/c-array-print-an-element-set-25933/1

fun main() {

	val array = intArrayOf(10, 20, 30, 40, 50)
	val index = 2
	var indexValue = -1
	
	for(i in 0 until array.size) {
		if(i == index) {
			indexValue = array[i]
			break
		}
	}
	
	println("$index position value is: $indexValue")

}