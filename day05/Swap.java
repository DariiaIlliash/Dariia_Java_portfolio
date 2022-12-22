package day05;

public class Swap {
	public static void main(String[] args) {
		String sky ="yellow";
		String sun ="blue";
		String cat;
	    cat = sky;
		sky = sun;
		sun = cat;
		
	    System.out.println("Sky is" + sky);
		System.out.println("Sun is" + sun);
	}

}
