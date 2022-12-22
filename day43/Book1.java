package day43;

public class Book1 {
	
		public String title;
		public int numberOfPages;
		
		public Book() {
			
		}
		
		public Book(String title, int numberOfPages) {
			this.title = title;
			this.numberOfPages = numberOfPages;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj == null && !(obj instanceof Book)) {
				return false;
			}
			
			Book book = (Book)obj;
			return book.title.equals(this.title) 
					&& book.numberOfPages == this.numberOfPages;
		}
		
		@Override
		public int hashCode() {
			return title.hashCode() + numberOfPages;
		}
	}


	