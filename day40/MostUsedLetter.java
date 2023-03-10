package day40;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostUsedLetter {
	public static void main(String[] args) {
		List<String> students = getStudents("src/day40/students.txt");
		System.out.println(students);
		Map<Character, Integer> letters = new HashMap<>();
		
		for (String name : students) {
			countLetters(letters, name);
		}
		System.out.println(letters);
		
		char mostUsedLetter = 0;
		int maxCount = 0;
		
		for (Character key : letters.keySet()) {
			if (maxCount < letters.get(key)) {
				maxCount = letters.get(key);
				mostUsedLetter = key;
			}
		}
		
		System.out.println(mostUsedLetter + " = " + maxCount);
	}
	
	public static void countLetters(Map<Character, Integer> letters, String str) {
		for (char letter : str.toCharArray()) {
			if (letters.containsKey(letter)) {
				letters.put(letter, letters.get(letter) + 1);
			} else {
				letters.put(letter, 1);
			}
		}
	}
	
	public static List<String> getStudents(String filePath) {
		try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
			List<String> list = new ArrayList<>();
			bf.lines().forEach(line -> {
				list.add(line);
			});
			return list;
		} catch(IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}