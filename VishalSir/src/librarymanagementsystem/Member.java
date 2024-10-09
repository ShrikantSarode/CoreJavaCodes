package librarymanagementsystem;

import java.util.ArrayList;

public class Member {

    private String name;
    private static long id = 1000;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public Member(String name) {
        this.name = name;
        this.memberId = "LIB" + ++id;
        borrowedBooks = new ArrayList<>(); // Correctly initialize the ArrayList
         }

    
	// Getters for member attributes (optional)
    public String getName() {
        return name;
    }
    public void setName(String name) {
		this.name = name;
	}


    public String getMemberId() {
        return memberId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Method to add a borrowed book
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    // Method to return a borrowed book
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    // Method to display borrowed books
    public void displayBorrowedBooks() {
        System.out.println("Borrowed Books for " + name + ":");
        for (Book book : borrowedBooks) {
            System.out.println(book); // Assuming Book class has a proper toString() method
        }
    }
}
