/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package with.modularity;

// BookLibrary.java

import java.util.List;

public class modularity {
    public static void main(String[] args) {
        Book bookManager = new Book();

        // Adding books
        bookManager.addBook("Book 1");
        bookManager.addBook("Book 2");
        bookManager.addBook("Book 3");

        // Displaying books
        List<String> books = bookManager.getAllBooks();
        System.out.println("Books:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}
