/**
Pyramid Pattern:

https://www.geeksforgeeks.org/problems/pyramid-patterns/1?page=1&category=pattern-printing&sortBy=submissions

	*
   ***
  *****
 *******
 
*/ 
fun main() {
 
	val n = 4
	
	for(row in 1..n) {
		// space
		for(space in 1..(n - row)) {
			print("  ")
		}
		//star
		for(star in 1..(2*row - 1)) {
			print("*")
		}
		println()
	}
 
}