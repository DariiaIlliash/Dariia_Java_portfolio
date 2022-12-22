package day30;

import java.util.Arrays;

public class ArrayReview {
    public static void main(String[] args) {
	int[] numArr = new int[3];
	System.out.println(numArr);
	String arrStr = Arrays.toString(numArr);
	System.out.println(arrStr);
	
	System.out.println(arrStr); // [0, 0, 0]
	
	String[] strArr = new String[] {"John", "Alex", "Kuba", "Ramesh"};
	System.out.println(Arrays.toString(strArr));
	
	double[] dNumsArr = {5.5, 1.5, 3.2, 1.1, 9.9};
	System.out.println(Arrays.toString(dNumsArr));
	
	dNumsArr = new double[] {1.5, 7.7, 1.9};
	System.out.println(Arrays.toString(dNumsArr));
	
	// length - instance variable 
	int size = dNumsArr.length; // find out number of elements of array
	System.out.println("Size: " + size);
}
}








	
}
}
