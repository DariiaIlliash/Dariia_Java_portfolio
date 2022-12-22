package day17;

public class StrCompareTo {
    public static void main(String[] args) {
	
    	String name = "Alex";
    	String nameTwo = "Azamat";
    	
    	System.out.println(name.compareTo(nameTwo));
    	if (name.compareTo(nameTwo)< 0) {
    		System.out.println(name + "precedes" + nameTwo+ " in alphabetical order");
    	}else {
    		System.out.println(name + " follows " + nameTwo + " in alphabetical order");
		}
		
		String str = "Abc";
		String strTwo = "Abc";
		System.out.println(str.compareTo(strTwo)); // 0
	}
}
    	


