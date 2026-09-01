// sum of first and last digit

// Better approach

fun main() {

    var number = 5832

    val lastDigit = number % 10

    while (number >= 10) {
        number /= 10
    }

    val firstDigit = number

    println("Final Result: ${firstDigit + lastDigit}")
}