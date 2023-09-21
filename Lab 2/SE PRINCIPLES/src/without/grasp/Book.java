/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package without.grasp;

import java.util.ArrayList;
import java.util.List;

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

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }

    public List<Book> getBooks() {
        return books;
    }
}

class LibraryUser {
    private String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class LibraryController {
    private Library library;

    public LibraryController(Library library) {
        this.library = library;
    }

    public void checkOutBook(LibraryUser user, String title) {
        List<Book> books = library.getBooks();
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isCheckedOut()) {
                book.checkOut();
                System.out.println(user.getName() + " checked out '" + title + "'.");
                return;
            }
        }
        System.out.println("Book '" + title + "' is not available for checkout.");
    }

    public void checkInBook(LibraryUser user, String title) {
        List<Book> books = library.getBooks();
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isCheckedOut()) {
                book.checkIn();
                System.out.println(user.getName() + " checked in '" + title + "'.");
                return;
            }
        }
        System.out.println(user.getName() + " does not have '" + title + "' to check in.");
    }
}


