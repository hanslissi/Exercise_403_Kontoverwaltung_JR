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
    private ArrayList<KontoBenutzer> users = new ArrayList<>();
    
    public void add(KontoBenutzer user){
        users.add(user);
        fireIntervalAdded(user, users.size()-1, users.size()-1);
    }
    
    public void performTest(int[] selectedAccounts){
        for (int selectedAccount : selectedAccounts) {
            new Thread(users.get(selectedAccount), users.get(selectedAccount).getName()).start();
        }
    }

    @Override
    public int getSize() {
        return users.size();
    }

    @Override
    public KontoBenutzer getElementAt(int index) {
        return users.get(index);
    }
}
