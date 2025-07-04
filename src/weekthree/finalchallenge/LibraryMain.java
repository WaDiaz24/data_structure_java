package weekthree.finalchallenge;

public class LibraryMain {
    public static void main(String[] args) {
        LibraryManager libraryManager = getLibraryManager();

        System.out.println(libraryManager.getBooks().size() + " books added to the library.");

        // Printing books by genre
        libraryManager.printBooksByGenre("Dystopian");
        libraryManager.printBooksByGenre("Fiction");

        // Searching for a book
        libraryManager.searchBook("1984");
        libraryManager.searchBook("The Catcher in the Rye");
    }

    private static LibraryManager getLibraryManager() {
        LibraryManager libraryManager = new LibraryManager();

        // Adding books to the library
        libraryManager.addBook(new Book("1984", "George Orwell", "Dystopian"));
        libraryManager.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction"));
        libraryManager.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic"));
        libraryManager.addBook(new Book("Brave New World", "Aldous Huxley", "Dystopian"));
        libraryManager.addBook(new Book("Brave New World", "Aldous Huxley", "Dystopian"));
        return libraryManager;
    }
}
