/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package without.grasp;



public class nograsp {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("To Kill a Mockingbird", "Harper Lee");

        LibraryUser user1 = new LibraryUser("Alice");
        LibraryUser user2 = new LibraryUser("Bob");

        LibraryController controller = new LibraryController(library);

        controller.checkOutBook(user1, "The Great Gatsby");
        controller.checkOutBook(user2, "To Kill a Mockingbird");
        controller.checkOutBook(user1, "To Kill a Mockingbird"); // Not available

        controller.checkInBook(user1, "The Great Gatsby");
        controller.checkInBook(user2, "The Great Gatsby"); // Bob doesn't have it

        controller.checkOutBook(user2, "The Great Gatsby");
    }
}

