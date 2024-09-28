package module2;

import java.util.Scanner;

public class Library {
	private int id, copiesAvailable;
	private int isbn;
	private String bookName, author;

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Book id: ");
		id = sc.nextInt();

		System.out.println("Enter Book copiesAvailable: ");
		copiesAvailable = sc.nextInt();

		System.out.println("Enter Book isbn: ");
		isbn = sc.nextInt();

		System.out.println("Enter Book Name: ");
		bookName = sc.next();

		System.out.println("Enter Book Author: ");
		author = sc.next();
	}

	public void add() {
		System.out.println("Book Added");
	}

	public void remove() {
		System.out.println("Book Removed");

	}

	public void search() {
		System.out.println("Your Searched Book is this...");
	}

	public void display() {
		System.out.println("Book id: " + id);
		System.out.println("Book Book Name: " + bookName);
		System.out.println("Book Author: " + author);
		System.out.println("Book Copies Availables: " + copiesAvailable);
		System.out.println("Book isbn: " + isbn);
	}

}
