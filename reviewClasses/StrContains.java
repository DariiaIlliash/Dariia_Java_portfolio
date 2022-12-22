package reviewClasses;

public class StrContains {
public static void main(String[] args) {
		
		// .contains(); method searches the sequence of character in the given string.
		// It returns true if sequence of char values are found in this string, otherwise returns false.
		
		String str = "The sun is shining.";
		
		System.out.println(str.contains("sun")); // true
		System.out.println(str.contains("shine")); // false
		
	}
}
