/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task8;

/**
 *
 * @author DOLPHIN
 */
public class Task8 {

    private void hugAnimal(SoundSource a) {
        a.makeSound();
    }

    public static void main(String[] args) {
        Dog d = new Dog("Rover");
        Task8 at = new Task8();
        at.hugAnimal(d);

    }

}
