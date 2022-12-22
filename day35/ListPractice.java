package day35;

import java.util.ArrayList;
import java.util.Arrays;

public class ListPractice {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 3, 10, 39, 25, 4));
		System.out.println("sum: " + sumOfEven(list)); // sum: 87
		
		list = new ArrayList<>(Arrays.asList(4, 4));
		System.out.println("sum: " + sumOfEven(list)); // sum: 8
		
		
	}
	
	// [4, 2, 3, 10, 39, 25, 4] -> 20
	public static int sumOfEven(ArrayList<Integer> list) {
		int sum=0;
	
	for (int num: list)	{
	if(num%2==0) {
		sum+=num;
	}
}
return sum;
}
}