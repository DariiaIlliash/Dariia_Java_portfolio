package day23;

public class WarmUpTwo {
	
		public static void main(String[] args) {
			printLetters("hello world"); 
		}
		
		/*
		 * prints each letter of str in the new lines
		 * 
		 * printLetters("apple");
		 * a
		 * p
		 * p
		 * l
		 * e
		 */
		public static void printLetters(String str) {
			// TODO
			
			for(int i=0; i<str.length();i++) {
				char ch = str.charAt(i);
				System.out.println(ch);
				
		}
	}

public static void pritRevLetters(String str) {
	for (int i =str.length()-1; i>= 0;i--) {
	
		System.out.println(str.charAt(i));
	}
}






}
