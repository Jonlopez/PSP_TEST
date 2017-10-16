/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_sincronizacion;

import java.lang.reflect.Array;
import javax.swing.JOptionPane;

/**
 *
 * @author Jon
 */
public class ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n_th = Integer.parseInt(JOptionPane.showInputDialog("N de hilos"));
        int incre = Integer.parseInt(JOptionPane.showInputDialog("Incremento"));
        
        th_aumentar ar_thAum [] = new th_aumentar[n_th];
        
        for (int i = 0; i < n_th; i++) {                        
            ar_thAum[i] = new th_aumentar(incre); 
        }
        
        for (int i = 0; i < n_th; i++) {
            ar_thAum[i].start();
            
        }
        
        
    }
    
}
