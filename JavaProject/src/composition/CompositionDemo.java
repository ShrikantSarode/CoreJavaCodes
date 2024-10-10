package composition;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

//    @Override
//    public String toString() {
//        return "Book [title=" + title + ", author=" + author + "]";
//    }
}

class Library {
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getTotalBooksInLibrary() {
        return books;
    }
}

public class CompositionDemo {

    public static void main(String[] args) {
        // Creating book instances
        Book book1 = new Book("The Litte Prince", "CN");
        Book book2 = new Book("Atomic Habbits", "POGO");
        Book book3 = new Book("The pilgrimage", "CN");
        Book book4 = new Book("Ikigai Japanese", "Amir bhau");
        Book book5 = new Book("Radhe", "Selmon Bhoi");

        // Adding the books into a collection
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        // Creating the Library object
        Library library = new Library(books);
        
        List<Book> bks = library.getTotalBooksInLibrary();
        int count=1;
        for (Book bk : bks) {
            System.out.println(count+".Title of Book is " + bk.getTitle() + " and Author is " + bk.getAuthor());
            count++;
        }
        
        // Alternatively, displaying total books in the library
        // library.getTotalBooksInLibrary().forEach(System.out::println);
    }
}
