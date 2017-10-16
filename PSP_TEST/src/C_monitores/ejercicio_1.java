/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_monitores;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jon
 */
public class ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    
    static final int SALDOINICIAL = 20;
    static final int NUMVECES = 10;
    static final int NUMHILOS = 2;
    
    public static void main(String[] args) {
        // TODO code application logic here
                
        
        syn_cuenta cuenta = new syn_cuenta(SALDOINICIAL);//€
        
        System.out.println("el saldo inicial de la cuenta es: "+cuenta.getSaldo());      
        
        th_ahorrador[] arr_thAhorrador = new th_ahorrador [NUMHILOS];
        th_gastador[] arr_thGastador = new th_gastador[NUMHILOS];
        
        for (int i = 0; i < NUMHILOS; i++) {
            arr_thAhorrador[i] = new th_ahorrador(cuenta, NUMVECES);
            arr_thGastador[i] = new th_gastador(cuenta, NUMVECES);
        }
        
        for (int i = 0; i < NUMHILOS; i++) {
            arr_thAhorrador[i].start();
            arr_thGastador[i].start();
        }
        
        for (int i = 0; i < NUMHILOS; i++) {
            try {
                arr_thAhorrador[i].join();
                arr_thGastador[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ejercicio_1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
                
        System.out.println("el saldo final de la cuenta es: "+cuenta.getSaldo());      
    }
    
}
