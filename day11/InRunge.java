package day11;

public class InRunge {
    public static void main(String[] args) {
	 System.out.println(inRange(9));
	 System.out.println(inRange(10));
	 System.out.println(inRange(15));
	 System.out.println(inRange(20));
	 System.out.println(inRange(25));
	 System.out.println(inRange(100));
}
  public static boolean inRange(int number) {
	  
	  if (number >=10 && number<=20){
		  
			  return true;
		  }
   return false;
}
}