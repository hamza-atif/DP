/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observers.pattern;

public class ObserverPatternDemo {
   public static void main(String[] args) {
      Subject subject = new Subject();

      HexaObserver ob =new HexaObserver(subject);
      OctalObserver obj= new OctalObserver(subject);
      BinaryObserver obje = new BinaryObserver(subject);
      
      subject.detach(obj); 
      System.out.println("Octal is detached");
      System.out.println("First state change: 15");	
      subject.setState(15);
      subject.detach(obje);
      System.out.println("Binary is detached");
      System.out.println("Second state change: 10");	
      subject.setState(10);
   }
}