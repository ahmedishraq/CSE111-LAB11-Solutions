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
public abstract class Animal {

    protected String sound = "Animal Sound";

    public Animal() {
    }

    Animal(String _sound) {
        this.sound = _sound;
    }

    public abstract String makeSound();

}
