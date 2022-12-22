package homework;

public class Project {
  public static void main (String[] args) { 
	  //int amount = Integer.parseInt(args[0]); 
	int amount = 99;
	  System.out.println(amount + "cents in coins:");
	  System.out.println((amount/25) + " quarters ");
	  System.out.println((amount%25)/10 + " dimes ");
	  System.out.println((amount%25%10)/5 + " nickels ");
	  System.out.println((amount%25%10%5)/1 + " pennies ");
}
}