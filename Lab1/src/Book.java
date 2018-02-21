
class Book {
	
	private String author;
	private String title;
	private int pages;
	private boolean borrowed;
	
	public Book() {
		author = "Stephen King";
		title = "It";
		pages = 1138;
		borrowed = false;
	}
	
	public Book(String author, String title, int pages, boolean borrowed) {
		this.author = author;
		this.title = title;
		this.pages = pages;
		this.borrowed = borrowed;
	}
	
	public void show() {
		
		String status = new String();
		
		if ( borrowed ) 	{ status = "Not available, book borrowed"; }
		else 				{ status = "Book available"; }
		
		System.out.println(
				"--------------------------------------------\n" +
				"Book info:\n\n" +
				"Title:\t\t" + title + "\n" +
				"Author:\t\t" + author + "\n" +
				"Pages:\t\t" + pages + "\n" +
				"Status:\t\t" + status + "\n");
	}
	
	public void borrow() {
		System.out.println(
				"--------------------------------------------\n");
		if (!borrowed ) {
			borrowed = true;
			System.out.println("OK, Book borrowed succesfully.\n");
		} else {
			System.out.println("Book already borrowed, better luck next time.\n");
		}
	}
	
	public void returnBook() {
		System.out.println(
				"--------------------------------------------\n");
		if ( borrowed ) {
			borrowed = false;
			System.out.println("OK, Book returned succesfully.\n");
		} else {
			System.out.println("Book already returned.\n");
		}
	}
	
	public boolean isAvailable() {
		
		if (!borrowed) 		{ return true; } 
		else 				{ return false; }
	}
	
	
	
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.isAvailable();
		book1.show();
		book1.borrow();
		book1.borrow();
		book1.show();
		book1.returnBook();
		book1.returnBook();
		book1.show();
	}
}

