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

public class th_disminuir extends Thread{

    private int decr;
    syn_variable var;
    
    public th_disminuir(int decr) {
        this.decr = decr;
    }

    @Override
    public void run() {
        var.resta(decr);        
    }
    
    
}
