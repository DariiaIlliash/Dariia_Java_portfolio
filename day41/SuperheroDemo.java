package day41;

public class SuperheroDemo {
	public static void main(String[] args) {
		Superhero s1 = new Superhero();
		
		Superhero s2 = new Superhero("Alex");
		System.out.println(s2.name);
		
		Superhero s3 = new Superhero("Kuba", 5);
		
		
		System.out.println(s3.name); // Kuba
		System.out.println(s3.powerLevel); // 5
	}
}


