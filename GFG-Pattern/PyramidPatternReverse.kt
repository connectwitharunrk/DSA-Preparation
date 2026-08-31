/**
Pyramid Pattern Reverse Order:
 
 *******
  *****
   ***
	*
 
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