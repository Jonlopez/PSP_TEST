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
public class th_time_cont extends Thread{
    
    int time;
    int contador;

    public th_time_cont(String nombre, int time, int contador) throws InterruptedException {
        this.setName(nombre);
        this.time = time;        
        this.contador = contador;
    }

    @Override
    public void run() {
    
        try {
            sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(th_time_cont.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < contador; i++) {
            System.out.println("Hilo -> " + this.getName() + " iteracion = " + i );
        }
        
    }
    
    
    
}
