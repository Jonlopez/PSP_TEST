/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B_sincronizacion;

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
        
        th_persona th_1 = new th_persona(60);
        th_persona th_2 = new th_persona(40);
        
        th_1.start();
        th_2.start();
        
        
        
        
    }
    
}
