package weekthree.finalchallenge;

import java.util.*;

public class LibraryManager {
    private final HashSet<Book> books;
    private final HashMap<String, ArrayList<Book>> booksByGenre;

    public LibraryManager() {
        books = new HashSet<>();
        booksByGenre = new HashMap<>();
    }

    public Set<Book> getBooks() {
        return Collections.unmodifiableSet(books);
    }

    public void addBook(Book book) {
        if (books.add(book)) {
            booksByGenre.computeIfAbsent(book.genre(), k -> new ArrayList<>()).add(book);
        }
    }

    public void printBooksByGenre(String genre) {
        ArrayList<Book> booksInGenre = booksByGenre.get(genre);
        if (booksInGenre != null && !booksInGenre.isEmpty()) {
            System.out.println("Books in genre " + genre + ":");
            for (Book book : booksInGenre) {
                System.out.println("- " + book.title() + " by " + book.author());
            }
        } else {
            System.out.println("No books found in genre " + genre);
        }
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.title().equalsIgnoreCase(title)) {
                System.out.println("Found book: " + book.title() + " by " + book.author() + " in genre " + book.genre());
                return;
            }
        }
        System.out.println("Book with title '" + title + "' not found.");
    }
}
