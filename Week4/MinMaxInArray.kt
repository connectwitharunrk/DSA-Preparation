// Week 4

// Min and Max in array
// https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1

fun main() {

	val array = intArrayOf(1, 4, 3, 5, 8, 6)
	
	var largValue = array[0]
	var smallValue = array[0]
	
	for(i in 1 until array.size) {
		
		if(largValue < array[i]) {
			largValue = array[i]
		} 
		
		if(smallValue > array[i]) {
			smallValue = array[i]
		}
	
	}
	
	println("smallValue: $smallValue -- largValue: $largValue")

}