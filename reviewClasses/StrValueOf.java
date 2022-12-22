package reviewClasses;

public class StrValueOf {
public static void main(String[] args) {
		
		// .valueOf(dataType); This method is used to convert argument type to String.
		
		int iNum = 30;
		
		double dNum = 4.56789;
		
		String s = "91";
		
		String sample = String.valueOf(iNum);
		System.out.println(sample);  // 30
		
		System.out.println(sample + s); // 3091
		
		String sample2 = String.valueOf(dNum);
		System.out.println(sample2); // 4.56789
		
		System.out.println(s + sample2); // 914.56789
		
		System.out.println("-------------------------");
		
		// .join(String delimiter, values......); This method is used to join values with delimiter in one string.
		
		String str = String.join(" < ", "Four", "Five", "Six", "Seven"); // Four < Five < Six < Seven
		System.out.println(str);
		
		String something = String.join(", ", "Coke", "Fanta", "Dr.Pepper", "Powerade"); // Coke, Fanta, Dr.Pepper, Powerade
		System.out.println(something);
		
	}













}
