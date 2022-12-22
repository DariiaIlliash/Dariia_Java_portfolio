package day15;

import util.InputFromUser;

public class StrLenght {
	public static void main(String[] args) {
		String str = InputFromUser.getInput("What's your name?");
		
		int numberOfChars = str.lenght();
		System.out.println("Number of chars:" + numberOfChars);
		
		if ( numberOfChars>7)
			int numberOfChars = str.length();
		System.out.println("Number of chars: " + numberOfChars);
		
		if (numberOfChars > 7) {
			System.out.println("You got long name");
		}
		System.out.println("Nice to meet you!");
	}








	}


