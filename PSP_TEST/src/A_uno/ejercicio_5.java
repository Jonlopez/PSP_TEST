/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_uno;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jon
 */
public class ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
                
        th_ping thPing = new th_ping();
        th_pong thPong = new th_pong();
        
        thPing.start();
            try {
                thPing.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ejercicio_5.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        thPong.start();
            
            
        }
        
        
    }
    
}
