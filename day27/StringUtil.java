package day27;

public class StringUtil {
	// static variables and methods are global and belong to class, 
	// not to specific object

		public static String str;
		
		public static void printEachChar(String str) {
			for (int i = 0; i < str.length(); i++) {
				System.out.println(str.charAt(i));
			}
		}
		
		public static String upperLower(String str) {
			if (str.length() % 2 == 0) {
				return str.toUpperCase();
			}
			return str.toLowerCase();
		}
	}	

