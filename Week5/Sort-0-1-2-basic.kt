
fun main() {

	var array = intArrayOf(0, 1, 2, 0, 1, 2)
	
    var count0 = 0
    var count1 = 0
    var count2 = 0
    
    for(num in array) {
        when(num) {
            0 -> count0++
            1 -> count1++
            2 -> count2++
        }
    }
    
    var index = 0
    
    repeat(count0) {
        array[index++] = 0
    }
    
    repeat(count1) {
        array[index++] = 1
    }
    repeat(count2) {
        array[index++] = 2
    }
    
	println(array.joinToString())
	
}