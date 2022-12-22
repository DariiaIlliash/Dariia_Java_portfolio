package day10;

public class CompOperators {
	public static void main(String[] args) {
		int i = 12;
		int j = 14;
		boolean isEqual = j == i;
		System.out.println(isEqual);
		boolean notEqual = j != i;
		System.out.println(notEqual);
		// Not equal !=
				//                14 not equal to 12 -> true
				boolean notEqual= j != i;
				System.out.println(notEqual); // true
				
				// Greater > 
				// Greater or equal >=
				System.out.println(j > i);  // true
				
				int num = 9;
				int num2 = 9;
				//                   9    9
				System.out.println(num >= num2); // true
				System.out.println(num > num2); // false
				
				// Less than <
				// Less than or equal <=
				System.out.println(num <= num2); // true
				System.out.println(num < num2); // false
			}
		}
	

}
