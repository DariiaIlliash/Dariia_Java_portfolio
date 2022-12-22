package day10;

public class Greater {
	public static void main(String[] args) {
		double res = boxTen(105.0);

		System.out.println(res);
	}

public static double boxTen(double numInput) {
	 if (numInput>100) {
		 return numInput;
		 
	 }else {
		 return 100.0;
	 }
}
