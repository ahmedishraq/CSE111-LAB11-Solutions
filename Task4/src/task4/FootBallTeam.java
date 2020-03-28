/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author DOLPHIN
 */
public class FootBallTeam extends Team {

    public FootBallTeam(String a, String b) {
        super(a, b);
    }

    public void getMascot() {
        System.out.println("Our football team mascot name is " + mascot);
    }

    public String toString() {
        return "Our name is " + super.name + "\nWe play Football";
    }
}
