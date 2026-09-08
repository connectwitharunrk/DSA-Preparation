// Week 4

// Max and Min Product from 2 Arrays

// https://www.geeksforgeeks.org/problems/product-of-maximum-in-first-array-and-minimum-in-second3943/1

fun main() {
	
	val array1 = intArrayOf(5, 7, 9, 3, 6, 2)
	val array2 = intArrayOf(1, 2, 6, 1, 9)
	
	var max = array1[0]
	var min = array2[0]
	
	for(i in 1 until array1.size) {
		if(max < array1[i]) {
			max = array1[i]
		}
	}
	
	println("Max: $max")
	for(i in 1 until array2.size) {
		if(min > array2[i]) {
			min = array2[i]
		}
	}
    
    println("Min: $min")
	
	println(max * min)
}