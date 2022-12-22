package day40;

import java.util.ArrayList;
import java.util.Random;

public class RandomStudent {
	public static void main(String[] args) {
		// TODO Create a program that runs a gives us random student name
		// Adrian, Arachaporn, Daria, Bianca, Dariia, Kelvin, Ksenia
		
		// 1. Put these names into the array
		// 2. Generate random number from 0 till last index by using Random
		//    class
		// 3. Use that random number as index to read random element
		
		
		String[]students= {"Adrian", "Arachaporn"," Daria", "Bianca", "Dariia"," Kelvin", "Ksenia"};
		Random r = new Random();
		int rIndex = r.nextInt(students.length); // 0 - 10
		
		System.out.println(students[rIndex]);
	}
	public static List<String> getStudent(String filePath){
		
	}
}

















