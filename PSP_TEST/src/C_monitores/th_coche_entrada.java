/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_monitores;

/**
 *
 * @author 9fdam03
 */
public class th_coche_entrada extends Thread{
    //Controla la carga del puente 15000
    syn_sSeguridad carga_puente;    
    private int carga_coche;

    public th_coche_entrada(syn_sSeguridad carga_puente,int carga_coche) {
        this.carga_puente = carga_puente;
        this.carga_coche = carga_coche;
    }

    @Override
    public void run() {
        carga_puente.entra_coche(carga_coche);
    }
    
       
    
}
