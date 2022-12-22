package reviewClasses;

public class StrSubstring {
public static void main(String[] args) {
	// .substring(); - This method has two variants and gives a new string that is a substring of the this string.
			// The substring begins with character at the specified index and extends to the end of the string.
			
			//                 012345678
			String greeting = "Good day";
			greeting = greeting.substring(0, 8); // Good day
			System.out.println(greeting);
			
			//            012345
			String str = "apple";
			System.out.println(str.substring(4)); // e
			
			// .substring(start, end);
			
			System.out.println("The substring of this string is: " + greeting); // The substring of this string is: Good day

		}
	








}

