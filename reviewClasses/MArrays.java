package reviewClasses;
import java.util.Arrays;
public class MArrays {
public static void main(String[] args) {
		
		String [][] names = {{"Mahdi", "Bek", "Kuba", "Alex"}, 
					   {"Kseniia", "Kelvin", "Dariia", "Mohammad"}, 
					   {"Salavat", "John", "Thomas", "Jacy"}, 
					   {"David", "Matthew", "Ronda", "James"}};
		
		System.out.println(Arrays.deepToString(names)); 
		System.out.println("---------------");
		for (String[] name : names) {
			for (String friends : name) {
				System.out.print(friends.toUpperCase() + " ");
			}
		}
		
	