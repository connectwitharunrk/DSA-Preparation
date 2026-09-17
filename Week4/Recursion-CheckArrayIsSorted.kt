// Week4 
// Check array is sorted


fun main() {
	val array = intArrayOf(1,2,3,4,5)
	val result = checkIsSorted(array, 0)
    println(result)
}

fun checkIsSorted(array: IntArray, index: Int): Boolean {
	if(index >= array.size - 1) return true
	if(array[index] > array[index + 1]) return false
	return checkIsSorted(array, index + 1)
}