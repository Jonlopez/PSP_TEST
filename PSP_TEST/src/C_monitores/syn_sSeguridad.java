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
 * @author 9fdam03
 */
public class syn_sSeguridad {
    
    private static int carga_max;
    private static int n_coches_max;
    

    public syn_sSeguridad(int carga_max, int n_coches_max) {
        
        this.carga_max = carga_max;
        this.n_coches_max = n_coches_max;
        
    }
    
    public synchronized void entra_coche(int peso_coche){
        
        System.out.println("carga disponible antes de entrar coche -> " + carga_max);
        while(!(
                (carga_max >= 0 && carga_max >= peso_coche && (carga_max - peso_coche >= 0))
                &&(n_coches_max > 0))
                )
        {
            try {
                System.out.println("\n\n\t\tLa cantidad de carga del puente-> " + carga_max  
                + " \n\n\t\t\tsupera el maximo permitido si perimitimos coche sería -> "+ (carga_max - peso_coche));
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(syn_cuenta.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }        
        carga_max -= peso_coche;
        n_coches_max -= 1;
        
        System.out.println("peso disponible del puente despues de entrar coche " + carga_max);        
        notifyAll();
        
    }
    
    public synchronized void sale_coche (int peso_coche){
        System.out.println("carga disponible antes de salir coche -> " + carga_max);        
        carga_max += peso_coche;
         n_coches_max += 1;
        System.out.println("carga disponible despues de salir coche -> " + carga_max);
        notifyAll();        
    }

    public static int getCarga_max() {
        return carga_max;
    }
    
}
