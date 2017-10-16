/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_uno;

import java.util.Vector;

/**
 *
 * @author Jon
 */
public class ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    
    public static int cont;
    
    public static void main(String[] args) throws InterruptedException {        
            
        for (int i = 0; i < 4; i++) {
            th_vCompartida th = new th_vCompartida();
            th.setName("th_" + (i + 1));            
            th.start();
            th.join();            
        } 
    }
    
}
