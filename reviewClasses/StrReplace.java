package reviewClasses;

public class StrReplace {
public static void main(String[] args) {
		
		// .replace(oldValue, newValue); - It is used replace old/existing values to new values.
		// It can be values, char, set chars(word, or symbols etc.)...
		
		String greeting = "Good morning";
		greeting = greeting.replace("morning", "evening");
		
		System.out.println("The string after replacing is: " + greeting); // The string after replacing is: Good afternoon
		
		String str = "I.like.drinking.coffee";
		System.out.println(str.replace(".", " ")); // I like drinking coffee
	}













}
