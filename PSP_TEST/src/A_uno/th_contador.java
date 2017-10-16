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
public class th_contador extends Thread{

    public th_contador(String id_hilo) {
        this.setName(id_hilo);
    }

    @Override
    public void run() {
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Hilo = " + this.getName() + " | contador -> " + (i+1));
                    
        }
        
    }
    
   
    
}
