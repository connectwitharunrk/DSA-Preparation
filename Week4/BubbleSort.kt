// Week 5

// Bubble Sort


fun main() {
	
	val array = intArrayOf(10, 4, 5, 1, 9, 7)
	val size = array.size
	
	for(i in 0 until size - 1) {
		for(j in 0 until size - 1 - i) {
			
            if(array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
			
		}
	}
	
	print(array.joinToString())
	
}


// optimized way of bubble sort

fun main() {
	
	val array = intArrayOf(10, 4, 5, 1, 9, 7)
	val size = array.size
	
	for(i in 0 until size - 1) {
		var swapped = false
		for(j in 0 until size - 1 - i) {
			
            if(array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
				swapped = true
            }
			
		}
		if(!swapped) break
	}
	
	print(array.joinToString())
	
}