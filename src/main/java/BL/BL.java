/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author hansf
 */
public class BL extends AbstractListModel<KontoBenutzer>{
    private ArrayList<KontoBenutzer> accounts = new ArrayList<KontoBenutzer>();
    
    public void add(KontoBenutzer account){
        accounts.add(account);
    }
    
    public void performTest(int[] selectedAccounts){
        for (int selectedAccount : selectedAccounts) {
            new Thread(accounts.get(selectedAccount), accounts.get(selectedAccount).getName()).start();
        }
    }

    @Override
    public int getSize() {
        return accounts.size();
    }

    @Override
    public KontoBenutzer getElementAt(int index) {
        return accounts.get(index);
    }
}
