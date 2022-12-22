package reviewClasses;
public class StrToUpperLowerCases {
public static void main(String[] args) {
	
	// .toUpperCase(); - It converts all the characters in the String to upper case.
	
	String str = "orange";
	str =str.toUpperCase();
	System.out.println(str); // ORANGE
	
	String str2 = "John Smith";
	System.out.println(str2.toUpperCase()); // JOHN SMITH
	
	// .toLowerCase(); - It converts all the characters(that have upper cases) in the String to lower case.
	
	String str3 = "Vegetables"; // vegetables
	str3 = str3.toLowerCase();
	System.out.println(str3);
	
	String str4 = "JOHN SMITH";
	System.out.println(str4.toLowerCase()); // john smith
}
}









