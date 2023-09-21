/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package withoutlowcoupling;

// Main.java
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(5, 3);
        System.out.println("Addition result: " + result);
        
        int result2 = calculator.subtract(10, 4);
        System.out.println("Subtraction result: " + result2);
    }
}
