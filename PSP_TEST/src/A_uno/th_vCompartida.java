/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_uno;

import static A_uno.ejercicio_7.cont;

/**
 *
 * @author Jon
 */



public class th_vCompartida extends Thread{

    public th_vCompartida() {
        
    }

    @Override
    public void run() {
        System.out.println(this.getName());
        
        for (int i = 0; i < 5; i++) {
            cont += 1;
            System.out.println(cont);
        }        
        
    }

    
    
}
