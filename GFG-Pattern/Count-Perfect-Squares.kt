// Count Perfect Squares
// https://www.geeksforgeeks.org/problems/count-squares3649/1

fun main() {
    
    val n = 9
    var square = 0
    var count = 1
    while(square < n) { 
        if(count * count >= n) break
        square = count * count 
        count ++
    }
    println(count - 1)
    
}


solution 2:

fun main() {
    val n = 9
    var count = 1

    while (count * count < n) {
        count++
    }

    println(count - 1)
}

solution 3:

import kotlin.math.ceil
import kotlin.math.sqrt

fun main() {
    val n = 9

    val count = ceil(sqrt(n.toDouble())).toInt() - 1

    println(count)
}

solution 3:

fun main() {

    val n = 9
    var count = 0

    for (i in 1..Math.sqrt(n.toDouble()).toInt()) {
        if (i * i < n) {
            count++
        }
    }

    println(count)
}