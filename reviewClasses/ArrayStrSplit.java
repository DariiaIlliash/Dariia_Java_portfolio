package reviewClasses;

public class ArrayStrSplit {
	public static void main(String[] args) {
		// The string split() method splits this string against given regular expression and returns a char array.
		
		String str = "I, like, playing, chess";
		String[] strArray = str.split(", ");
		
		// using for-each loop to print elements of string array
		for (String arr : strArray) {
			System.out.println(arr);
		}
	
	}
}
