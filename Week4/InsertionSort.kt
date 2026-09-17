// Week 4

// Insertion Sort

fun main() {
	
	val array = intArrayOf(10, 4, 5, 1, 9, 7)
	
	for(i in 1 until array.size) {
		val key = array[i]
		val j = i - 1
		
		while(j >= 0 && array[j] > key) {
			
			array[j + 1] = array[j]
			j --
		
		}
		array[j + 1] = key
	}
	
}