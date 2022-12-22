package day06;

public class Student {
  public static void main(String[] args) {
	  
	  String name = "Liza";
	  double grade = 100.0;
	  
	  System.out.println("Student name is:" + name);
	  System.out.println("Student grade is:" + grade);
	  
	  double percentage = 8.0;
	  double percentToAdd = grade * percentage/ 100;
	  grade = grade + percentToAdd;
	  
	System.out.println("Student name is:" + name);
	System.out.println("Student grade is:" + grade);
  }

}
