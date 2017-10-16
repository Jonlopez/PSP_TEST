/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_sincronizacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Jon
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n_th = Integer.parseInt(JOptionPane.showInputDialog("N de hilos"));
        int incre_decre = Integer.parseInt(JOptionPane.showInputDialog("Incremento"));        
        
        th_aumentar arr_thAum [] = new th_aumentar[n_th];
        th_disminuir arr_thDis [] = new th_disminuir[n_th];
        
        for (int i = 0; i < n_th; i++) {
            arr_thAum[i] = new th_aumentar(incre_decre);
            arr_thDis[i] = new th_disminuir(incre_decre);
        }
        
        for (int i = 0; i < n_th; i++) {
            arr_thAum[i].start();
            arr_thDis[i].start();
        }
        
        
    }
    
}
