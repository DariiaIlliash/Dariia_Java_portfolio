package day10;

public class MoreMethods {
	public static void main(String[] args) {
		bigNumber(1200);
		bigNumber(542);

	}

	public static void bigNumber(int number) {
	  if (number > 1000){
		  System.out.println(number + "is big number");
		  } else {
		  System.out.println(number + "is regular number");
		  }
	  }
  }
