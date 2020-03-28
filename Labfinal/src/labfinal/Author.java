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
public class Author {

    Book[] arr;

    public Author(Book[] x) {
        arr = x;
    }

    public void addBook(Book b) {
        Book[] arr2 = new Book[arr.length + 1];
        arr2[arr2.length - 1] = b; 
        for (int i = 0; i < arr2.length - 1; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    public String toString() {
        String a = "";
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Name: " + arr[i].name + ", Genre: " + arr[i].genre);  
        }
        return a ;
    }
}
