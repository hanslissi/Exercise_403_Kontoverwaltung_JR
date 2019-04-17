/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import javax.swing.JLabel;


/**
 *
 * @author johannesriedmueller
 */
public class Konto extends JLabel{
    private double balance;
    public void updateTextDisplay(){
        this.setText(String.format("%.2f", balance));
    }
    
    public Konto(double balance) {
        this.balance = balance;
        this.setHorizontalAlignment(RIGHT);
        updateTextDisplay();
    }
    
    public synchronized void deposit(double amount){
        this.balance += amount;
        updateTextDisplay();
        
    }
    
    public synchronized void withdraw(double amount) throws EmptyException{
        if(balance < amount){
            throw new EmptyException();
        }
        this.balance -= amount;
        updateTextDisplay();
    }
}
