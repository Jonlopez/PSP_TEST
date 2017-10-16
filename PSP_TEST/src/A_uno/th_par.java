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
public class th_par extends Thread{

    public th_par() {
    }

    @Override
    public void run() {
        
        int con_par = 0;
        
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println("Nº par -> " + i);
                con_par += 1;
            }
        }
        
        System.out.println("Nº pares 0-100 = " + con_par);
    }
    
    
}
