package day29;

public class Tempereture {
	public static void main(String[] args) {
		double[] temp = {32.1, 30, 25.7, 26, 34, 31.5, 29};
	
		double totalSum = 0.0;
		for (int i=0; i<=temp.length; i++){// TODO find out sum of element in the temp array
		totalSum +=temp[i];
		double averageTemp =totalSum/temp.length;
		// TODO find out average temp
		// totalSum / arraySize
		
		System.out.println("Total sum: " + totalSum);
		System.out.println("Average temperature: " + averageTemp);
	}
}
}
