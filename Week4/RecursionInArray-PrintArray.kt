// Week 4
// Recursion in array

fun main() {
	val array = intArrayOf(10, 20, 30, 40, 50)
	printArray(array, 0)
}

fun printArray(array: IntArray, index: Int) {
	if(index == array.size) return
	print("${array[index]} ")
	printArray(array, index + 1)
}