/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task7;

/**
 *
 * @author DOLPHIN
 */
public class Task7 {

    public static void printSound(Animal a) {
        System.out.println(a.makeSound());
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("bark");
        Cat c1 = new Cat("meow");
        printSound(c1);
        printSound(d1);

    }

}
