/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import Observer.Observer;
import Observer.Subject;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johannesriedmueller
 */
public class KontoBenutzer extends Thread implements Subject {

    private Konto account;
    private String name;
    private final Observer observer;

    public KontoBenutzer(Konto account, String name, Observer observer) {
        this.account = account;
        this.name = name;
        this.observer = observer;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) throws EmptyException {
        account.withdraw(amount);
    }

    @Override
    public void run() {
        int i = 0;
        Random r = new Random();
        while (i < 10) {
            int res = r.nextInt(2);
            int amount = 10 + r.nextInt(50);
            synchronized (account) {
                switch (res) {
                    case 0:
                        deposit(amount);
                        inform(name + " deposited € " + amount + ",-\n");
                        account.notifyAll();
                        i++;
                        break;
                    case 1:
                        try {
                            withdraw(amount);
                            inform(name + " has withdrawn € " + amount + ",-\n");
                        } catch (EmptyException empty) {
                            try {
                                account.wait();
                            } catch (InterruptedException ex) {
                                Logger.getLogger(KontoBenutzer.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            continue;
                        }
                        i++;
                        break;
                }
            }
            try {
                Thread.sleep(1 + r.nextInt(1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(KontoBenutzer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        inform(name+" done!\n");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void inform(String str) {
        observer.update(str);
    }

}
