package homework;

public class CigarParty {
	 public static void main(String[] args) {
	        String res = lastChars("last", "chars");
	        System.out.println(res);
	    }

	    public static String lastChars(String a, String b) {
	      String first ="@";
	      String last="@";
	      if (a.length()>0)
	        first = a.substring(0,1);
	      if (b.length()>0)
	          last = b.substring(b.length()-1);
	    return first + last; // your code goes here
	    }
	}