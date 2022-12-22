package reviewClasses;

public class StrStartEnd {
public static void main(String[] args) {
		
		// .startsWith(); This method tests if a string starts with the specified prefix beginning from the first index. 
		// .endsWith(); it checks whether the string ends with a specified suffix.
		// These methods return a boolean value true or false.
		
		String str = "The weather is great today.";
		
		System.out.println(str.startsWith("The weather is great")); // true
		System.out.println(str.startsWith("weather")); // false
		
		System.out.println(str.endsWith(".")); // true
		System.out.println(str.endsWith("The weather is great")); // false
		
	}








}
