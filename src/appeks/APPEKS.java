/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appeks;

import landing_page.Landing_page;

/**
 *
 * @author FASIH
 */
public class APPEKS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Landing_page lp = new Landing_page();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        lp.setDefaultCloseOperation(Landing_page.EXIT_ON_CLOSE); 
    }
    
}
