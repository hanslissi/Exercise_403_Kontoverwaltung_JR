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
public class KontoBenutzer {
    private Konto konto;
    private String name;

    public KontoBenutzer(Konto konto, String name) {
        this.konto = konto;
        this.name = name;
    }
    
    public void deposit(double amount){
        konto.deposit(amount);
    }
    
    public void withdraw(double amount){
        konto.withdraw(amount);
    }
}
