/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hansf
 */
public class KontoTest {
    
    public KontoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of updateTextDisplay method, of class Konto.
     */
    @org.junit.Test
    public void testUpdateTextDisplay() {
        System.out.println("updateTextDisplay");
        Konto instance = null;
        instance.updateTextDisplay();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deposit method, of class Konto.
     */
    @org.junit.Test
    public void testDeposit() {
        System.out.println("deposit");
        double amount = 0.0;
        Konto instance = null;
        instance.deposit(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withdraw method, of class Konto.
     */
    @org.junit.Test
    public void testWithdraw() throws Exception {
        System.out.println("withdraw");
        double amount = 0.0;
        Konto instance = null;
        instance.withdraw(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
