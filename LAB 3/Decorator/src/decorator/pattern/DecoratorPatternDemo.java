/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator.pattern;

public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape circle = new Circle();

      Shape redCircle = new RedShapeDecorator(new Circle());

      Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Circle with normal border");
      circle.draw();
      circle.price();

      System.out.println("\nCircle of red border");
      redCircle.draw();
      redCircle.price();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();
      redRectangle.price();
   }
}
