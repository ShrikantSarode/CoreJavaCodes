package assignment7;

public class Library {
    
    Book[] books; // Renamed for clarity
    static int size = 0;
    final static int maxBookSize = 6;

    public Library() {
        this.books = new Book[maxBookSize];
    }

    public void addBook(Book book) {
        if (size < maxBookSize) {
            books[size++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full!!!");
        }
    }

    public void removeBook(Book book) {
        boolean found = false;

        for (int i = 0; i < size; i++) {
            // Assuming you want to compare by title and author
            if (books[i].author.equals(book.author) && books[i].title.equals(book.title)) {
                found = true;
                for (int j = i; j < size - 1; j++) {
                    books[j] = books[j + 1]; // Shift left
                }
                books[size - 1] = null; // Clear the last book
                size--;
                System.out.println("Book removed successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("Book is not available.");
        }
    }

    public void display() {
        if (size == 0) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < size; i++) {
                System.out.println("Title: " + books[i].title + ", Author: " + books[i].author);
                System.out.println("===========================================================");
            }
        }
    }
}
