/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_uno;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jon
 */
public class ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here

            th_time_cont th = new th_time_cont("Hilo_1", 1214, Integer.parseInt(JOptionPane.showInputDialog("hasta que número quiere contar?")));
            th.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(ejercicio_8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
