// Week 4
// Palindrome Array
// https://www.geeksforgeeks.org/problems/perfect-arrays4645/1

fun main() {
	val array = intArrayOf(1, 2, 3, 2, 1)
	val reverseIndex = array.size - 1
	var isPalindrome = true
	
	for(index in 0 until array.size) {
		if(array[index] != array[reverseIndex]) {
			isPalindrome = false
			break
		}
		reverseIndex --
	}
	
	println(isPalindrome)
}


// solution 2: Best approach

fun main() {
	val array = intArrayOf(1, 2, 3, 2, 1)
	
	var left = 0
	var right = array.size - 1
	var isPalindrome = true
	while(left < right) {
		if(array[left] != array[right]) {
			isPalindrome = false
			break
		}
		
		left ++
		right --
	}
	
	println(isPalindrome)
}