package day35;

public class VarargsReview {
	
		
		public static void main(String[] args) {
			// Varargs is only for method argument
			int res = sum(5, 3);
			System.out.println(res);
			
			res = sum(3, 2, 1);
			System.out.println(res);
			
			res = sum(5, 4, 2, 9);
			System.out.println(res);
			
			res = sum(new int[] {1, 2, 3, 4, 5, 6, 7});
			System.out.println(res);
			
			System.out.println("---");
			
			print("Java", "Python"); // 
		}
		
		//                            [3, 2, 1]
		public static int sum(int... numbers) {
			int sum = 0;
			for (int num : numbers) {
				sum += num;
			}
			return sum;
		}
		
		public static void print(String s, String s2) {
			System.out.println("In two args method");
			System.out.println(s);
			System.out.println(s2);
		}
		
		public static void print(String... strs) {
			System.out.println("In varargs method");
			for (String str : strs) {
				System.out.println(str);
			}
		}
	}

