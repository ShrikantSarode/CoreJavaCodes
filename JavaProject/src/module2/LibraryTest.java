package module2;

public class LibraryTest {

	public static void main(String[] args) {

		Library library = new Library();
		library.accept();
		library.display();
		library.add();
		library.remove();
		library.search();
		System.out.println("========================");

		Library library2 = new Library();
		library.accept();
		library2.display();
		library2.add();
		library2.remove();
		library2.search();
		System.out.println("========================");

	}
}
