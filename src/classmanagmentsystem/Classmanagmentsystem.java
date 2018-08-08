/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classmanagmentsystem;

import javax.swing.UIManager;
/**
 *
 * @author sewmi
 */
public class Classmanagmentsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try { 
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
} catch (Exception ex) { 
    ex.printStackTrace(); 
}
       // new bk().setVisible(true);
        new Login().setVisible(true);
    }
    
}
