/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labfinal;

/**
 *
 * @author DOLPHIN
 */
public class Labfinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Book b1 = new Book("Hello", "hi");
      Book b2 = new Book("Good", "Best");
      Book b3 = new Book("Ishraq", "ATM");
      Book b4 = new Book("Great", "Wow");
      Book [] arr = {b1, b2, b3,b4};
        System.out.println(b1);
       // b1.addBook(b4);
    }
    
}
