// Week 4
// Alternates in an Array
// https://www.geeksforgeeks.org/problems/print-alternate-elements-of-an-array/1

fun main() {

	val array = intArrayOf(1, 2, 3, 4)
	
	for(i in 0 until array.size) {
		if((i + 1) % 2 != 0) print("${array[i]} ") 
	}

}