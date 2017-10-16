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
public class ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        th_par thPar = new th_par();
        
        th_impar thImpar = new th_impar();
        
        thPar.setPriority(1);
        thImpar.setPriority(9);
        
        thPar.start();
        thImpar.start();
        
    }
    
}
