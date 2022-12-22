package reviewClasses;

public class StrRepeat {
public static void main(String[] args) {
		
		// .repeat(int count); The string can be repeated N number of times, and we can generate a new string that has repetitions.
		
		String word = "Coke";
		int i = 4;
		
		System.out.println(word.repeat(i)); // CokeCokeCokeCoke
		
		String word2 = "Sprite";
		int c = 0;
		
		System.out.println("String: " + word2.repeat(c)); // String: 
		
	}
}
