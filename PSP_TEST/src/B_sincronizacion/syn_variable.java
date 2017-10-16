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
public class syn_variable {
    
    static int total = 0;   
    
    public static synchronized void suma(int suma) {
        System.out.println("Antes " + total);
        total += suma;
        System.out.println("después " + total);
    }
    
    public static synchronized void resta(int resta) {
        System.out.println("Antes " + total);
        total -= resta;
        System.out.println("después " + total);
    }
    
    
}
