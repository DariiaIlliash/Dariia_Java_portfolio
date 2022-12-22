package reviewClasses;

public class StringMethods {
	public static void main (String[] args) {
		// String is a sequence of characters in ""(double quotes).
		// Strings are immutable which means a constant and cannot be changed once created.
		// Java has a lot of String methods that allow us to work with them
		
		// .length(); - It gives the number of characters in the String.
		
		
		//            0123456789
		String str = "pineapple";
		
		int fruit = str.length();
		System.out.println("The length of str is: " + fruit);
		
		//             01234567891011
		String str2 = "I like java";
		System.out.println("The number of characters of str2 is: " + str2.length());
		
		
	
	}

} 


