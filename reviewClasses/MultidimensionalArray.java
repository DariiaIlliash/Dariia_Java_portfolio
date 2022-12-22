package reviewClasses;

public class MultidimensionalArray {
public static void main(String[] args) {
		
		// Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other arrays.
		// A multidimensional array is created by appending one set of square brackets([]) per dimension.
		// Multidimensional arrays can be defined in simple words as array of arrays.
		
		int arr[][] = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.println(arr[i][j] + " ");
			
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(arr)); // [[2, 7, 9], [3, 6, 1], [7, 4, 2]]
	}







}
