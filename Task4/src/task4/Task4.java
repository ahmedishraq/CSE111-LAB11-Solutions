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
public class Task4 {

      public static void printDetail(Team t){
    System.out.println("----Printing Detail-----");
    System.out.println(t);
    t.getMascot();
  }

    public static void main(String[] args) {
        FootBallTeam f = new FootBallTeam("Brazil","Ace Purple");
    CricketTeam c = new CricketTeam("Australia","Golden Griffin");
    printDetail(f);
    printDetail(c);

    }
    
}
