package day32;

public class LinearSearch {
     public static void main(String[] args) {
	int[] numArr = {50,1,3,14,55,8,9,10};
	int targetIndex= search(numArr,55);
	System.out.println("Index of 55:" + targetIndex);
	targetIndex = search(numArr, 1000);
	System.out.println("Index of 1000: " + targetIndex);
}

public static int search(int[] arr, int target) {
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] == target) {
			return i;
		}
	}
	
	return -1;
}








}

