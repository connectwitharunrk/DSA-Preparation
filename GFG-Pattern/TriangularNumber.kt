// Triangular number

fun main() {
	val n = 10
	val x = 8 * n + 1
	val root = Math.sqrt(x.toDouble()).toInt()
	
	if(root * root == x) {
		println(1)
	} else {
		println(0)
	}
}