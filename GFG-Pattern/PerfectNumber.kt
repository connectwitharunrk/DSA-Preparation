// Perfect number

fun main() {

    val number = 281

    if (number <= 1) {
        println("Not a perfect number")
        return
    }

    var sum = 1

    for (divisor in 2..Math.sqrt(number.toDouble()).toInt()) {

        if (number % divisor == 0) {

            sum += divisor

            val pair = number / divisor

            if (pair != divisor) {
                sum += pair
            }
        }
    }

    if (sum == number) {
        println("Perfect number")
    } else {
        println("Not a perfect number")
    }
}