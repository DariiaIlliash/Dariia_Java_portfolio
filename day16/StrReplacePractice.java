package day16;

public class StrReplacePractice {
   public static void main(String[] args) {
	   String str = "Apple.Banana.Kiwi.Orange";
	   System.out.println(str);
	   str = str.replace(".", ",");
	   str = str.toLowerCase();
	
     System.out.println(str);
}
}