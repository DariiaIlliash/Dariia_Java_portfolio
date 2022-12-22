package reviewClasses;

public class StrEquals {
     public static void main(String[] args) {
    	
    			
    			// .equals(); method compares the two given strings based on the data/content of the string.
    			// If all the content of both the string are the same, it returns true.
    			// If all characters are not matched, then it returns false.
    			// The main difference between .equals() method and "==" operator is that one is a method, the other is operator.
    			// We can use == operators for reference comparison(address comparison) and
    			// .equals() method for content comparison. 
    			// == checks if both objects point to the same memory location
    			// whereas .equals() evaluates to the comparison of values in the objects.
    			
    			String str = "car";
    			String str2 = "cat";
    			
    			System.out.println(str.equals(str2)); // false
    			
    			String word1 = "Flower";
    			String word2 = "flower";
    			
    			System.out.println(word1.equals(word2)); // false
    			
    		}








}

