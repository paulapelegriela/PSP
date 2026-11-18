/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.Contador;

import teoria.Contador.Contador;

/**
 *
 * @author paula
 */
public class MainContador {
    
    public static void main(String[] args) {
        
        Contador cont1 = new Contador();
        Thread hilo1 = new Thread(cont1);
        hilo1.start();
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        //Vamos a darle 3 intentos, al intentar 6
        
        for (int intento = 1; intento <= 3; intento++) {
            if (cont1.isWorking()){
                System.out.println("Esperando...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.err.println("Error: " + e);
                }
                if (intento == 3){
                    hilo1.interrupt();
                }else{
                    System.out.println("Hilo libre...");
                }
            }
        }
    }
}
