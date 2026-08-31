/**
Pyramid Pattern Reverse Order:
 
 *******
  *****
   ***
	*
 https://www.geeksforgeeks.org/problems/inverted-triangle-of-stars0110/1?page=1&category=pattern-printing&sortBy=submissions
*/ 

fun main() {
	
	val n = 4
	
	for(row in n downTo 1) {
		//space
		for(space in (n - row) downTo 1) {
			print(" ")
		}
		 
		//star
		for(star in (2*row - 1) downTo 1) {
			print("*")
		}
		
		println()
	}
	
}