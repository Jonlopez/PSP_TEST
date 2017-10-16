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
public class th_persona extends Thread{
    
    private int cantidad;
    syn_cuenta cuenta;

    public th_persona(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        cuenta.extraerDinero(cantidad);
    }
    
}
