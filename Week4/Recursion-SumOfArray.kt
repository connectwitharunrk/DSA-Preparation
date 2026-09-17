// Week 4 
// Recursion - sum of array

fun main() {
	val array = intArrayOf(1,2,3,4,5)
	val result = sumOfArray(array, 0)
	println(result)
}

fun sumOfArray(array: IntArray, index: Int): Int {
	if(index == array.size) return 0
	return array[index] + sumOfArray(array, index + 1)
}