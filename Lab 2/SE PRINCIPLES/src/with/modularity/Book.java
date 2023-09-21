/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package with.modularity;

// BookManager.java
import java.util.ArrayList;
import java.util.List;

public class Book {
    private List<String> books;

    public Book() {
        this.books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
    }

    public void removeBook(String book) {
        books.remove(book);
    }

    public List<String> getAllBooks() {
        return new ArrayList<>(books);
    }
}
