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
public class ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    
    private static final int NUM_COCHES = 20;
    private static final int MAX_PESO_PUENTE = 15000;
    private static final int PESO_COCHE = 5000;
    private static final int N_COCHES_MAX = 5;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        syn_sSeguridad synSeguridad = new syn_sSeguridad(MAX_PESO_PUENTE, N_COCHES_MAX);
               
        th_coche_entrada [] arr_thcEntrada = new th_coche_entrada [NUM_COCHES];
        th_coche_salida [] arr_thcSalida = new th_coche_salida [NUM_COCHES];
        
        for (int i = 0; i < NUM_COCHES; i++) {
            arr_thcEntrada[i] = new th_coche_entrada(synSeguridad, PESO_COCHE);
            arr_thcSalida[i] = new th_coche_salida(synSeguridad, PESO_COCHE);
        }
        
        for (int i = 0; i < NUM_COCHES; i++) {
             arr_thcEntrada[i].start();
             arr_thcSalida[i].start();
        }
        
    }
    
}
