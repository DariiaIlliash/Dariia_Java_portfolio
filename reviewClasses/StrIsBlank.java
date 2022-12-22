package reviewClasses;

public class StrIsBlank {
public static void main(String[] args) {
		
		// In Java 11, new method called isBlank(); was added in the String class.
		// The isBlank(); method will return true, if the string is empty and if the string contains only whitespaces.
		
		String emptyString = "";
		System.out.println(emptyString.isBlank()); // true
		
		String emptyStringWithSpace = "   ";
		System.out.println(emptyStringWithSpace.isBlank()); // true
		
		String emptyStringWithTabSpace = "   \n  \t  "; //   /n => new line,   \t => tab space 
		System.out.println(emptyStringWithTabSpace.isBlank()); // true
		
		String word1 = "a  ";
		System.out.println(word1.isBlank()); // false
		
	}










}
