package homework;


public class CaughtSpeeding{ 
	public static void main(String[] args) {
		
	}

	
		public int getNumberOfLetters(String str) {
	    	// implement method and return number of letter in str(white space is not a letter)
	      String name = str.replace(" ","");
	      int numberOfChars = name.length();
	      	return numberOfChars;
	    }
	  
	  	public String transform(String str) {
	    	// if length of str is even return upper case version of it
	        // if length of str is odd return lower case version of it
	      boolean value = (str.length() % 2 == 0);
	      str = value ? str.toUpperCase() : str.toLowerCase();
	      	return str;
	    }
}
	  	