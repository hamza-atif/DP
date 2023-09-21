
package with.grasp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Book {
    private String title;
    private String author;
    private boolean isCheckedOut;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut() {
        isCheckedOut = true;
    }

    public void checkIn() {
        isCheckedOut = false;
    }
}

// Entity class representing a LibraryUser
class LibraryUser {
    private String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Creator: Library class is responsible for creating and managing books
class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
}

// Controller: LibraryController is responsible for managing book checkouts
class LibraryController {
    private Library library;
    private Map<LibraryUser, List<Book>> userBooks;

    public LibraryController(Library library) {
        this.library = library;
        this.userBooks = new HashMap<>();
    }

    public void checkOutBook(LibraryUser user, String title) {
        List<Book> availableBooks = library.getAvailableBooks();
        for (Book book : availableBooks) {
            if (book.getTitle().equals(title)) {
                book.checkOut();
                userBooks.computeIfAbsent(user, k -> new ArrayList<>()).add(book);
                System.out.println(user.getName() + " checked out '" + title + "'.");
                return;
            }
        }
        System.out.println("Book '" + title + "' is not available for checkout.");
    }

    public void checkInBook(LibraryUser user, String title) {
        List<Book> userCheckedOutBooks = userBooks.get(user);
        if (userCheckedOutBooks != null) {
            for (Book book : userCheckedOutBooks) {
                if (book.getTitle().equals(title)) {
                    book.checkIn();
                    userCheckedOutBooks.remove(book);
                    System.out.println(user.getName() + " checked in '" + title + "'.");
                    return;
                }
            }
        }
        System.out.println(user.getName() + " does not have '" + title + "' to check in.");
    }
}