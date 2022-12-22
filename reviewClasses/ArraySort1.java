package reviewClasses;

public class ArraySort1 {
	public static void main(String[] args) {
		
		
		Integer[] arr = {13, 7, 6, 45, 21, 9, 2, 100}; // 100, 45, 21, 13, 9, 7, 6, 2
		
		// We have Integer instead of int[] as Collections.reverseOrder.
		// It doesn't work for primitives.
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println("ReverseOrdered arrays is: " + Arrays.toString(arr)); // ReverseOrdered arrays is: [100, 45, 21, 13, 9, 7, 6, 2]
	 }
}
