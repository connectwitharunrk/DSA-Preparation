// Week 4
// count digits of a number

fun main() {
    val n = 353445

    val result = countDigits(n)

    println(result)
}

fun countDigits(n: Int): Int {

    // Base case
    if (n == 0) {
        return 0
    }

    // Recursive case
    return 1 + countDigits(n / 10)
}