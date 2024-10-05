package assignment7;

public class TestBook {

    public static void main(String[] args) {
        
        // Create an array of Book objects
        Book[] books = new Book[] {
            new Book("Prince Of Persia", "Shrikant"), 
            new Book("Kings of Titan", "Akash Jha"), 
            new Book("Robber Robins", "James Gauslin"),
            new Book("The Alchemist", "Paulo Coelho"),
            new Book("1984", "George Orwell"),
            new Book("To Kill a Mockingbird", "Harper Lee"),
            new Book("The Great Gatsby", "F. Scott Fitzgerald") // Extra book for testing overflow
        };

        // Create a Library object
        Library library = new Library();

        // Add books from the array to the library
        for (Book book : books) {
            library.addBook(book);
        }

        // Display the books in the library
        library.display();
    }
}
