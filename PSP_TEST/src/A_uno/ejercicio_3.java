/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_uno;

/**
 *
 * @author Jon
 */
public class ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        th_contador hCon = new th_contador("Hilo_1");
        th_contador hCon_2 = new th_contador("Hilo_2");
        th_contador hCon_3 = new th_contador("Hilo_3");
        
        hCon.start();
        hCon_2.start();
        hCon_3.start();
        
        
    }
    
}
