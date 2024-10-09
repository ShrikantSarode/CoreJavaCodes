package librarymanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private HashMap<String, Book> books;
    private HashMap<String, Member> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    // Remove a book from the library
    public void removeBook(String bookId) {
        books.remove(bookId);
    }

    // Update a book's details
    public void updateBook(String bookId, Book updatedBook) {
        books.put(bookId, updatedBook);
    }

    // Search for a book by title
    public Book searchBookByTitle(String title) {
        for (Book book : books.values()) {
            if (book.getTitle().equalsIgnoreCase(title)) { // Assuming Book has a getTitle() method
                return book;
            }
        }
        return null; // Not found
    }

    // Search for books by author
    public ArrayList<Book> searchBookByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getAuthor().equalsIgnoreCase(author)) { // Assuming Book has a getAuthor() method
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    // Search for books by category
    public ArrayList<Book> searchBookByCategory(String category) {
        ArrayList<Book> foundBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getCategory().equalsIgnoreCase(category)) { // Assuming Book has a getCategory() method
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    // Add a member to the library
    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    // Remove a member from the library
    public void removeMember(String memberId) {
        members.remove(memberId);
    }

    // Update a member's details
    public void updateMember(String memberId, Member updatedMember) {
        members.put(memberId, updatedMember);
    }

    // Get a member by ID
    public Member getMemberById(String memberId) {
        return members.get(memberId);
    }

    // Borrow a book for a member
    public void borrowBook(String memberId, String bookId) {
        Member member = members.get(memberId);
        Book book = books.get(bookId);
        if (member != null && book != null) {
            member.borrowBook(book);
            removeBook(bookId); // Assuming borrowed books are removed from the library's collection
        }
    }

    // Return a book for a member
    public void returnBook(String memberId, String bookId) {
        Member member = members.get(memberId);
        if (member != null) {
            Book book = new Book(bookId); // Create a new Book object or retrieve it from the library
            member.returnBook(book);
            addBook(book); // Add it back to the library's collection
        }
    }

    // Display all books
    public void displayAllBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books.values()) {
            System.out.println(book); // Assuming Book class has a proper toString() method
        }
    }

    // Display all members
    public void displayAllMembers() {
        System.out.println("Members of the Library:");
        for (Member member : members.values()) {
            System.out.println(member); // Assuming Member class has a proper toString() method
        }
    }
}
