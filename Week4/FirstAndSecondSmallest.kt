// Week 4

// First and second smallests
// https://www.geeksforgeeks.org/problems/find-the-smallest-and-second-smallest-element-in-an-array3226/1

fun main() {

    val arr = intArrayOf(2, 4, 3, 5, 6)

    var smallest = Int.MAX_VALUE
    var secondSmallest = Int.MAX_VALUE

    for (num in arr) {

        if (num < smallest) {
            secondSmallest = smallest
            smallest = num
        } 
        else if (num > smallest && num < secondSmalleast) {
            secondSmallest = num
        }
    }

    if (secondSmallest == Int.MAX_VALUE) {
        println(-1)
    } else {
        println("$smallest $secondSmallest")
    }
}