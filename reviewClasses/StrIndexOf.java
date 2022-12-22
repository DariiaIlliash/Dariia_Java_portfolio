package reviewClasses;

public class StrIndexOf {
	public static void main(String[] args) {
		
	// .indexOf(); - This method gives the index within this string of the first occurrence of the specified character 
			//  or -1, if the character does not occur.
			
			//            012345678910...... 1819 
			String str = "Good morning, world!";
			int index = str.indexOf('i');
			System.out.println("Index of 'i' is: " + index); // Index of 'i' is: 9

			System.out.println(str.indexOf("morning")); // 5
			System.out.println(str.indexOf("world")); // 14
			
		}

}







