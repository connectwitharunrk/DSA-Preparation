//week 5
// third greatest number

fun main() {
	val array = intArrayOf(12, 35, 1, 10, 34, 17, 1)
	println(thirdLargest(array))
}

fun thirdLargest(array: IntArray): Int {

    if (array.size < 3) {
        return -1
    }

    var largest = -1
    var secondLargest = -1
    var thirdLargest = -1

    for (i in 0 until array.size) {

        if (array[i] >= largest) {

            thirdLargest = secondLargest
            secondLargest = largest
            largest = array[i]

        } else if (array[i] >= secondLargest) {

            thirdLargest = secondLargest
            secondLargest = array[i]

        } else if (array[i] >= thirdLargest) {

            thirdLargest = array[i]
        }
    }

    return thirdLargest
}