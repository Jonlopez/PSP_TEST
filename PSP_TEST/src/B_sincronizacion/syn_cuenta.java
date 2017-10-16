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
public class syn_cuenta {
    
    private static int saldo = 50; //€

    public static synchronized void extraerDinero(int cantidad){
        System.out.println("Saldo disponible -> " + saldo);
        if(saldo >= 0 && saldo > cantidad){
            saldo -= cantidad;
            System.out.println("Saldo disponible despues de extraer " + cantidad + "€ -> " + saldo);
        }else{
            System.out.println("La cantidad de -> " + cantidad  
                    + " supera el saldo disponible de -> "+ saldo);
        }
        
    }
    
    public static synchronized void introducirDinero(){
        
    }
    
    
}
