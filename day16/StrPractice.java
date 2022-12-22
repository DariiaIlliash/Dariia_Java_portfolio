package day16;

public class StrPractice {
public static void main(String[] args) {
	public static void main(String[] args) {
		System.out.println(isEevenLegth("java")); // true
		System.out.println(isEevenLegth("apple")); // false
		System.out.println(isEevenLegth("abc")); // false
	}
	
	/*
	 * return true if str argument length is even, otherwise return false
	 * isEevenLegth("java"); -> true
	 * isEevenLegth("apple"); -> false
	 * isEevenLegth("abc"); -> false
	 * 
	 */
	public static boolean isEevenLegth(String str) {
		// TODO your code goes here
		int str1 = str.length();
		if (str1 % 2 == 0) {
			return true;
		}else {
			return false;
		}		
	}				
				
				
				
				
				
	



