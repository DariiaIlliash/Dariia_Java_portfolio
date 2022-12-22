package day50;

import java.io.File;

public class AbsVsRelativePath {
     public static void main(String[] args) {
    	 File myNotes = new File("/Users/lisachernina/eclipse-workspace/sdet-java-b7/src/day50/notes.txt");
    	 System.out.println("File exists:"+ myNotes.exists());
    	 System.out.println(myNotes.getAbsolutePath());
    	 
    	 File myNoteRelativePath = new File("src/day50/notes.txt");
    	 System.out.println("File exists:" + myNoteRelativePath.exists());
    	 System.out.println(myNoteRelativePath.getAbsolutePath());
}
}
