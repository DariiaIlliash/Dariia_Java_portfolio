package day17;

public class StrEquals {
	public static void main(String[] args) {
		String box = "apple";
		String boxTwo = "apple";
		if (box.equals(boxTwo)) {
			System.out.println("They are equal");
		}else {
			System.out.println("They are not equal");
		}
		System.out.println(box.equals(boxTwo));
		String str = "John Doe";
		String strTwo = "john doe";
		if (str.equalsIgnoreCase(strTwo)) {
			System.out.println("NAMES ARE SAME");
		} else {
			System.out.println("NAMES ARE NOT SAME");
		}
		
		System.out.println(str);
		System.out.println(strTwo);
	}
}
	


