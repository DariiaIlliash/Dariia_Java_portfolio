package day09;

public class MethodArguments {
	public static void main(String[] args) {
		sayHello("Bek");
		sayHello("John");
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello " + name + "!");
	}
}


