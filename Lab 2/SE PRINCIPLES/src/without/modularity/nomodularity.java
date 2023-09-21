/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package without.modularity;

import java.util.ArrayList;
import java.util.List;

public class nomodularity {
    public static void main(String[] args) {
        List<String> books = new ArrayList<>();

        // Adding books
        books.add("Book 1");
        books.add("Book 2");
        books.add("Book 3");

        // Displaying books
        System.out.println("Books:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}

