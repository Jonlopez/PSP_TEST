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
public class th_impar extends Thread{

    public th_impar() {
    }

    @Override
    public void run() {
        int con_impar = 0;
        
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                System.out.println("Nº impar -> " + i);
                con_impar += 1;
            }
        }
        
        System.out.println("Nº impares 0-100 = " + con_impar);
    }
    
    
    
}
