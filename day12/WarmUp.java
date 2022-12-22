package day12;

public class WarmUp {
 public static void main(String[] args) {
	System.out.println(getEvenOddMsg(5));
	System.out.println(getEvenOddMsg(2));
	System.out.println(getEvenOddMsg(4));
	System.out.println(getEvenOddMsg(10));
}

public static String getEvenOddMsg(int num) {
	 if (num == 10) {
      return "ten";
	 }
	 if (num % 2 == 0) {
		 return "even";
	 }
		return "odd";
		}
	 }
 
 

