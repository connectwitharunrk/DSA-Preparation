// week 5
// sort 0s, 1s, 2s


fun main() {

	var array = intArrayOf(0, 1, 2, 0, 1, 2, 0, 1, 0, 2, 2, 2, 1)
	
	var low = 0
	var mid = 0
	var high = array.size - 1
	
	while(mid <= high) {
		
		when(array[mid]) {
			0 -> {
				swap(array, low, mid)
				low++
				mid++
			}
			1 -> {
				mid++
			}
			2 -> {
				swap(array, mid, high)
				high--
			}
		}
		
	}
	
    println(array.joinToString())
}

fun swap(array: IntArray, i: Int, j: Int) {
	val temp = array[i]
	array[i] = array[j]
	array[j] = temp
}