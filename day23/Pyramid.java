package day23;

import util.InputFromUser;

public class Pyramid {
   public static void main(String[] args) {
	String inputStr=InputFromUser.getInput("Enter number:");
	int pyramidLevel= Integer.parseInt(inputStr);
	System.out.println(pyramidLevel);
	
	String hash ="#";
	String pyramidDisplay = hash;
	for (int i = 0; i<pyramidLevel;i++) {
		System.out.println(pyramidDisplay);
		pyramidDisplay=pyramidDisplay + hash;
	}
}
}
