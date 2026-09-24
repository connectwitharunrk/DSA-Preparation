// Week 5
// Merge Sort

fun main() {
	val array = intArrayOf(12, 35, 1, 10, 34, 17, 1)
 	mergeSort(array, 0, array.size - 1)
    println(array.joinToString())
}

fun mergeSort(array: IntArray, left: Int, right: Int) {
    if(left >= right) return
    
    val mid = left + (right - left) / 2
    
    mergeSort(array, left, mid)
    mergeSort(array, mid + 1, right)
    
    merge(array, left, mid, right)
}

fun merge(array: IntArray, left: Int, mid: Int, right: Int) {
    val temp = IntArray(right - left + 1)
	
    var i = left
    var j = mid + 1
    
    var k = 0
    
    while(i <= mid && j <= right) {
        if(array[i] <= array[j]) {
            temp[k] = array[i]
            i++
        } else {
            temp[k] = array[j]
            j++
        }
        k++
    }
    
    while(i <= mid) {
        temp[k] = array[i]
        i++
        k++
    }
    
    
    while(j <= right) {
        temp[k] = array[j]
        j++
        k++
    } 
    
    for(x in temp.indices) { 
        array[left + x] = temp[x]
    }
}