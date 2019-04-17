/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;


/**
 *
 * @author johannesriedmueller
 */
public class Konto {
    private double balance;

    public Konto(double balance) {
        this.balance = balance;
    }
    
    public synchronized void deposit(double amount){
        this.balance += amount;
    }
    
    public synchronized void withdraw(double amount){
        this.balance -= amount;
    }
}
