/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package without.singleton;

import java.util.ArrayList;
import java.util.List;

// Book class to represent books in the library
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

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

// Patron class to represent library patrons
class Patron {
    private String name;

    public Patron(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// LibrarySystem class to manage books and patrons
public class LibrarySystem {
    private List<Book> books;
    private List<Patron> patrons;

    public LibrarySystem() {
        // Initialize book and patron lists
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    // Methods to add and retrieve books and patrons
    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Added book: " + book);
    }

    public void addPatron(String name) {
        Patron patron = new Patron(name);
        patrons.add(patron);
        System.out.println("Added patron: " + patron.getName());
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Patron> getAllPatrons() {
        return patrons;
    }

    // Other library operations can be added here

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        library.addBook("The Catcher in the Rye", "J.D. Salinger");
        library.addBook("To Kill a Mockingbird", "Harper Lee");
        library.addPatron("Alice");
        library.addPatron("Bob");

        // Retrieve and print all books and patrons
        System.out.println("\nAll Books:");
        for (Book book : library.getAllBooks()) {
            System.out.println(book);
        }

        System.out.println("\nAll Patrons:");
        for (Patron patron : library.getAllPatrons()) {
            System.out.println(patron.getName());
        }
    }
}
