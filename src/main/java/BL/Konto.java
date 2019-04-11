/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.util.ArrayList;

/**
 *
 * @author johannesriedmueller
 */
public class Konto {
    private ArrayList<KontoBenutzer> user = new ArrayList<>();
    private double balance;

    public Konto(double balance) {
        this.balance = balance;
    }
    
    public void addUser(KontoBenutzer user){
        this.user.add(user);
    }
    
    public void deposit(double amount){
        this.balance += amount;
    }
    
    public void withdraw(double amount){
        this.balance -= amount;
    }
}
