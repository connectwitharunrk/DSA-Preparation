/**

   *
  ***
 *****
*******
 *****
  ***
   *
   
https://www.geeksforgeeks.org/problems/pattern/1?page=1&category=pattern-printing&sortBy=submissions

*/

fun main() {

	val n = 4
	
	for(row in 1..n) {
		//space
		for(space in 1..(n - row)) {
			print(" ")
		}
		//star
		for(star in 1..((2 * row) - 1)) {
			print("*")
		}
		println()
        
    }
    for(row in n - 1 downTo 1) {
		//space
		for(space in (n - row) downTo 1) {
			print(" ")
		}
		//star
		for(star in ((2 * row) - 1) downTo 1) {
			print("*")
		}
		
		println()
	}

}