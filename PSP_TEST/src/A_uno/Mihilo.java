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
public class Mihilo extends Thread{
    
    String palabra;

    public Mihilo(String palabra) {
        this.palabra = palabra;
    }

   
    public void run ()
    {
        System.out.println("Ejecucuión del hilo -> " + this.getName());
        for(int i=0; i<10; i++ ){
            System.out.println("String -> " + palabra +  " Nº = " + (i + 1));
            /*
            try {
                Thread.sleep(1212);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mihilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            */
        }
    }
    
}
