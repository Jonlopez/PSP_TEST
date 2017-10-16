/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_uno;

import javax.swing.JOptionPane;

/**
 *
 * @author Jon
 */

public class ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Comienza MAIN creando HILO");
        Mihilo hilo = new Mihilo(JOptionPane.showInputDialog("Escribe una palabra"));
        hilo.setName("Hilo_1");
        System.out.println("Lanzamos START del hilo");
        hilo.start();
        
        System.out.println("creando HILO_2");
        hilo = new Mihilo("pepe 2");
        hilo.setName("Hilo_2");
        System.out.println("Lanzamos 2º START del hilo");       
        hilo.start();
        
        System.out.println("creando HILO_3");
        hilo = new Mihilo("pepe 3");
        hilo.setName("Hilo_3");
        System.out.println("Lanzamos 3º START del hilo");       
        hilo.start();
        
    }    

   
}


