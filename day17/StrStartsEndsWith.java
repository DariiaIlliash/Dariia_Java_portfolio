package day17;

public class StrStartsEndsWith {
public static void main(String[] args) {
	String str ="Java is object-oriented programming language";
	System.out.println(str.startsWith("Java is obj"));
	System.out.println(str.startsWith("is obj"));
	System.out.println(str.startsWith("Java is object-oriented programming")); // true
	System.out.println(str.startsWith("Java is object-oriented programming language")); // true
	
	System.out.println(str.endsWith("mming")); // flase
	System.out.println(str.endsWith("mming language")); // true
	System.out.println(str.endsWith("Java is object-oriented programming language")); // true
}
}


