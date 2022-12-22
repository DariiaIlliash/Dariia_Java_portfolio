package reviewClasses;

import util.InputFromUser;

public class printSum {
	
	    public static void main(String[] args) {
	       printSum1(9, 3);
	    }

	    public static void printSum1(int num, int num1) {
	
	      num = Integer.parseInt(InputFromUser.getInput("Enter number:"));
	      num1 = Integer.parseInt(InputFromUser.getInput("Enter number:"));
	      int sum = num + num1;
	      System.out.print(num);
	      System.out.print(" + ");
	      
	      System.out.print(num1);
	      System.out.print(" = ");
	      System.out.print(sum);// your code goes here
	    }
	}
	

