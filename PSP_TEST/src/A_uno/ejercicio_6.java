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
public class ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String sms_1 [] = {"sms_1","sms_2","sms_3","sms_4","sms_5"};
        
        th_5_sms al_1 = new th_5_sms(sms_1);
        
        al_1.setName("Alumno_1");
        
        th_5_sms al_2 = new th_5_sms(sms_1);
        
        al_2.setName("Alumno_2");
        
        th_5_sms al_3 = new th_5_sms(sms_1);
        
        al_3.setName("Alumno_3");
        
        al_1.start();
        
        try {
            al_1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ejercicio_6.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        al_2.start();
        
        try {
            al_2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ejercicio_6.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        al_3.start();
        
        try {
            al_3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ejercicio_6.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        System.out.print("Termina el programa");
        
        
        
    }
    
}
