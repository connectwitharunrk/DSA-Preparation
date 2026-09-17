fun main() {

    val array = intArrayOf(12, 35, 1, 10, 34, 1)

    println(secondLargest(array))
}

fun secondLargest(array: IntArray): Int {
	
	var largest = -1
	var secondLargest = -1
	var max = -1

	for(i in 0 until array.size) {
		
		if(array[i] > largest) {
			secondLargest = largest
			largest = array[i]
		} else if(array[i] > secondLargest && array[i] != largest) {
			secondLargest = array[i]
		}
		
	}

	return secondLargest
}


solution 2:



fun secondLargest(array: IntArray): Int {
	
	var largest = -1
	var secondLargest = -1

	for(i in 0 until array.size) {
		
		if(array[i] > largest) { 
			largest = array[i]
		} 
		
	}
	
	for(i in 0 until array.size) {
		
		if(array[i] > secondLargest && array[i] != largest) {
			secondLargest = array[i]
		}
		
	}

	return secondLargest
}