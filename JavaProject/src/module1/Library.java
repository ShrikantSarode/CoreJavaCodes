package module1;

public class Library {

	private int id,copiesAvailable;
	private long isbn;
	private String bookName,author;
	
	public
		void add()
		{
			System.out.println("Book Added");
		}
		void remove()
		{
			System.out.println("Book Removed");
			
		}
		void search()
		{
			System.out.println("Your Searched Book is this...");
		}
		void display()
		{
			System.out.println("Book id: "+id);
			System.out.println("Book Book Name: "+bookName);
			System.out.println("Book Author: "+author);
			System.out.println("Book Copies Availables: "+copiesAvailable);
			System.out.println("Book isbn: "+isbn);
		}
	public static void main(String[] args) {
		
		Library library = new Library();
		library.id=1;
		library.bookName="Titian King";
		library.author="Ram";
		library.copiesAvailable=5;
		library.isbn=123545586l;
		library.display();
		library.add();
		library.remove();
		library.search();
		System.out.println("========================");
		Library library2 = new Library();
		library2.id=2;
		library2.bookName="John Wick";
		library2.author="Chritofer";
		library2.copiesAvailable=5;
		library2.isbn=123545586l;
		library2.display();
		library2.add();
		library2.remove();
		library2.search();
		System.out.println("========================");
		Library library3 = new Library();
		library3.id=3;
		library3.bookName="Harry Potter";
		library3.author="Suresh";
		library3.copiesAvailable=5;
		library3.isbn=123545586l;
		library3.display();
		library3.add();
		library3.remove();
		library3.search();
		System.out.println("========================");
	}

}
