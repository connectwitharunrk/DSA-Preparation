/**

Input:

n = 8

Expected output:

1 

2 2 

3 3 3 

4 4 4 4 

5 5 5 5 5 

6 6 6 6 6 6 

7 7 7 7 7 7 7 

8 8 8 8 8 8 8 8 


*/


fun main() {
	
	val n = 8
	 
	for(row in 1..n) {
		for(col in 1..row) {
			print("$row ")
		}
		println()
	}
}