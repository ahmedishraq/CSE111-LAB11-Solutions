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
public abstract class Animal {

    //Name of the Animal
    private String name;

    //Constructor
    Animal(String _name) {
        this.name = _name;
    }

    //Return name
    protected String getName() {
        return name;
    }

}
