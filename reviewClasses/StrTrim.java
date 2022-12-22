package reviewClasses;

public class StrTrim {
public static void main(String[] args) {
		
		// .trim(); method in Java String is a built-in function that eliminates leading and trailing spaces.
		// The .trim(); method doesn't eliminate middle spaces.
		
		String str = "   Good day, my friend! ";
		System.out.println(str.trim()); // Good day, my friend!
		
		String str2 = "fresh   air   ";
		System.out.println(str2.trim()); // // fresh   air
		
		//.isEmpty(); This method is used to check if the string is empty or not.
		// It returns true if this composite name is empty, otherwise false.
		
		String word1 = "";
		System.out.println(word1.isEmpty()); // true
		
		String word2 = " ";
		System.out.println(word2.isEmpty()); // false
		
	}
















}
