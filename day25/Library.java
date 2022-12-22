package day25;

public class Library {
	public static void main(String[] args) {
		// TODO
		// 1.Create 2 objects from Book class with all 
		//   properties assigned (any value)
		
		// 2.Print both object details
		Book book = new Book();
		book.title = "math";
		book.author = "Joe Doy";
		book.pages = 100;
		System.out.println(book.title);
		System.out.println(book.author);
		System.out.println(book.pages);
		
		Book bookTwo= new Book();
		bookTwo.title = "History";
		bookTwo.author = "Joe Fox";
		bookTwo.pages = 300;
		System.out.println(bookTwo.title);
		System.out.println(bookTwo.author);
		System.out.println(bookTwo.pages);
		Book bookOne = new Book();
		bookOne.title = "OCA";
		bookOne.author = "Jeanne Boyarsky";
		bookOne.pages = 400;
		
		Book bookTwo1 = new Book("Java", "Savitvh", 650);
		
		System.out.println("Table one");
		bookOne.displayDetails();
		
		System.out.println("---");
		
		System.out.println("Table two");
		bookTwo.displayDetails();
		
	}
}

