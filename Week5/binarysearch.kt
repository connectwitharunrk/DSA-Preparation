// Week 5
// Binary Search


fun main() {
	
	val array = intArrayOf(1,2,3,4,5)
	val target = 4
	
	val result = binarySearch(array, target)
	println(result)
}

fun binarySearch(array: IntArray, target: Int): Int {
	
	var left = 0
	var right = array.size - 1
	while(left <= right) {
		val mid = (left + right ) / 2
		
		if(array[mid] == target) return mid
		
		if(target > array[mid]) left = mid + 1
		else right = mid - 1
	}
	
	return -1

}