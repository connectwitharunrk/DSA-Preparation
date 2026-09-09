// Week 4

// print fibonacci series

fun main() {
    val n = 7
 
    var a = 0
    var b = 1
    print("$a, $b, ")
    for(i in 2..n) {
        val c = a + b
        print("$c, ")
        a = b
        b = c
    }
}

 