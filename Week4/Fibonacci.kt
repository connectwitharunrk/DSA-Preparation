// Week 4
// Fibonacci 

fun main() {
    val n = 5

    val result = fibonacci(n)

    println(result)
}

fun fibonacci(n: Int): Int {

    // Base case
    if (n == 0) return 0
    if (n == 1) return 1

    // Recursive case
    return fibonacci(n - 1) + fibonacci(n - 2)
}