package day17;

public class StrContains {
 public static void main(String[] args) {
	
	 String str = "Variables, assigment operators, arithmetic oparators ";
	 boolean isThere = str.contains("operators");
	 System.out.println(isThere);
	 
	 System.out.println(str.contains("java")); // false
		System.out.println(str.contains("arithmetic")); // true
		System.out.println(str.contains("nt op")); // true
		System.out.println(str.contains(", a")); // true
		System.out.println(str.contains("able")); // true
		System.out.println(str.contains("Variables, assignment operators, arithmetic operators")); // true
		
		String msg = "Hello, Class!";
		String value = "hello";
		
		System.out.println(msg.contains(value)); // false
		
		// how we can ignore the cases with contains?
		
		//                   "hello, class!".contains("hello") -> true
		System.out.println(msg.toLowerCase().contains(value.toLowerCase())); // true
		
		//                   "HELLO, CLASS!".contains("HELLO") -> true
		System.out.println(msg.toUpperCase().contains(value.toUpperCase())); // true
	} 
}

