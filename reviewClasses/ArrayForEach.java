package reviewClasses;

public class ArrayForEach {
public static void main(String[] args) {
		
		// In Java, the for-each loop is used to iterate through elements of arrays and collections.
		
		int[] nums = {125, 132, 95, 116, 110};
		
		int hNums = maximum(nums);
		System.out.println("The lowest score is " + hNums);  // The highest score is 95
	}
		
	public static int maximum(int[] numbers) {
		int maxNum = numbers[0];
		
		// for each loop.
		for (int num : numbers) {
			if (num < maxNum) {
				maxNum = num;
			}
		}
		
	
	return maxNum;
	}
}








