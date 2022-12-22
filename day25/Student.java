package day25;

public class Student {
public String firstName;
public String lastName;
public double grade;
public Student() {
	System.out.println("inside empty constructor");
	
}
public Student(String firstName,String lastName,double grade) {
	System.out.println("inside constractor with 3 args" );
	this.firstName= firstName;
	this.lastName = lastName;
	this.grade = grade;
	
public void displayDetails() {
	System.out.println("firstName:" + this.firstName);
	System.out.println("lastName:" + this.lastName);
	System.out.println("this.grade:" + this.grade);
}
}
