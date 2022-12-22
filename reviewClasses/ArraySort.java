package reviewClasses;
import java.util.Arrays;
public class ArraySort {
public static void main(String[] args) {
		
		// Arrays.sort()
		
		int[] arr = {5, -2, 23, 7, 87, -42, 509};
		
		System.out.println("The original array is: " );
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		Arrays.sort(arr);
		System.out.println();
		
		System.out.println("The sorted array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("---------------");
		
		System.out.println("Sorted array: " + Arrays.toString(arr)); // Sorted array: [-42, -2, 5, 7, 23, 87, 509]
	}





















}
