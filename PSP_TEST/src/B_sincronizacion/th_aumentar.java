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
public class th_aumentar extends Thread{

    private int incr;
    private syn_variable var;

    public th_aumentar(int incr) {
        this.incr = incr;
    }
    
    @Override
    public void run() {
  
        var.suma(incr);
        
    }
    
    
    
}
