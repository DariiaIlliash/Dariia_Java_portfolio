package reviewClasses;

public class StrCompare {
public static void main(String[] args) {
		
		// .compareTo(); method compares the given string with the current string lexicographically.
		// If the first string is lexicographically greater than the second string, 
		// it returns a positive number(difference of character value).
		// If the first string is less than the second string lexicographically,
		// it returns a negative number.
		// If the first string is lexicographically equal to the second string, it returns 0.
		
		/*
		 * if string1 > string2, it returns positive number
		 * if string1 < string2, it returns negative number
		 * if string1 == string2, it returns 0.
		 */
		
		String word1 = "ape";
		String word2 = "zebra";
		
		System.out.println(word1.compareTo(word2)); // -25
		System.out.println(word2.compareTo(word1)); // 25
		
	}
}















}
