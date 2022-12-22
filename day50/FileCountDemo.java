package day50;

public class FileCountDemo {
	public static void main(String[] args) {
		FileCounter counter = new FileCounter();
		int numberOfFiles = counter.countFiles("src");
		System.out.println("The number of files created in 50 days:" + numberOfFiles);
	
		FileCounter counterTwo = new FileCounter();
		int n = counterTwo.countFiles("/Users/lisachernina/Desktop");
		System.out.println("The number of files in Desktop: " + n);
		
	}
}
