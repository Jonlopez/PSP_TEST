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
public class th_5_sms extends Thread{
    
    private String sms [];

    public th_5_sms(String sms []) {
        this.sms = sms;
    }

    @Override
    public void run() {
        
        for (String cur_sms : sms) {
            
            System.out.println( this.getName() + " -> " +  cur_sms);
            
        }
     
        
        
    }
    
    
    
}
