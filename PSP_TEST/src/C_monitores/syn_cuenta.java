/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_monitores;

import B_sincronizacion.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jon
 */
public class syn_cuenta {
    
    private int saldo; //€

    public syn_cuenta(int saldo) {
    this.saldo = saldo;
    }
    

    public synchronized void extraerDinero(int cantidad){
        System.out.println("Saldo disponible antes de sacar -> " + saldo);
        while(!(saldo >= 0 && saldo >= cantidad))
        {
            try {
                System.out.println("La cantidad de -> " + cantidad  
                + " supera el saldo disponible de -> "+ saldo);
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(syn_cuenta.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }        
        saldo -= cantidad;
        System.out.println("Saldo disponible despues de extraer " + cantidad + "€ -> " + saldo);        
        notifyAll();
    }
    
    public synchronized void introducirDinero(int cantidad){
        System.out.println("Saldo disponible antes de meter -> " + saldo);
        saldo += cantidad;
        System.out.println("Introduciendo pasta... - saldo -> " + saldo);
        notifyAll();
    }

    public int getSaldo() {
        return saldo;
    }
    
    
    
}
