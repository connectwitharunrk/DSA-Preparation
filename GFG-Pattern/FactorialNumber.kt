// Factorial of an number

fun main() {

    val number = 5
    var factorialNumber = 1
 
    for (i in 1..number) {
        factorialNumber *= i
    }

    println("Factorial of $number is : $factorialNumber")
}