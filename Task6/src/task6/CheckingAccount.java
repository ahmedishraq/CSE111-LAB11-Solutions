/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;

/**
 *
 * @author DOLPHIN
 */
public class CheckingAccount extends Account {

    public CheckingAccount(String n, double b) {
        super(n);
        setBalance(b);
    }

    public void printAccountInfo() {
        System.out.println("==================================");
        System.out.println("Name : " + getName() + "\nAccount Number : " + getAccountNumber() + "\nBalance : " + getBalance());
        if (getBalance() < 500) {
            System.out.println("Your balance is less than the minimum amount");
        }
        System.out.println("==================================");
    }

    public String deposit(double d) {
        if (d <= 0) {
            return "Please enter amount greater than zero";
        } else {
            double nb = getBalance() + d;
            setBalance(nb);
            return "Deposit Successful";
        }
    }

    public String withdraw(double w) {
        if (w <= 0) {
            return "Please enter amount greater than zero";
        } else if (w > getBalance()) {
            return "You do not have enough funds";
        } else  {
            double ub = getBalance() - w;
            setBalance(w);
            return "Withdraw Successful";
        }
    }

}
