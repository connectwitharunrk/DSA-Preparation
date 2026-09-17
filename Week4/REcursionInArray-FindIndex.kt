// Week 4
// Recursion - Search

fun main() {
	val array = intArrayOf(10, 20, 30, 40, 50)
	val index = printArray(array, 0, 40)
	print(index)
}

fun printArray(array: IntArray, index: Int, target: Int): Int {
	if(index >= array.size) return -1
	
	return if(array[index] == target) index
	else {
		printArray(array, index + 1, target)
	} 
}