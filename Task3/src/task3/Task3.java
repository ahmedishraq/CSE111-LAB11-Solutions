/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author DOLPHIN
 */
public class Task3 {

    public static void printName(Student s) {
        System.out.println("Name : " + s.getName());
    }

    public static void main(String[] args) {
        printName(new BBAStudent());
        printName(new BBAStudent("Barack Obama"));
        printName(new BBAStudent("Joe Biden"));

    }

}
