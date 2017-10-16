/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_monitores;

/**
 *
 * @author Jon
 */
public class th_ahorrador extends Thread{
    
    private syn_cuenta cuenta;
    private int cantidad;

    public th_ahorrador(syn_cuenta cuenta, int cantidad) {
        this.cuenta = cuenta;
        this.cantidad = cantidad;
    }

    @Override
    public void run() {
        System.out.println("Entro en run ahorrador, catidad -> " + cantidad);
        for (int i = 0; i < cantidad; i++) {
            cuenta.introducirDinero(cantidad);
        }        
    }
    
     
    
}
