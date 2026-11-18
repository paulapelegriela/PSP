/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.contador2;

/**
 *
 * @author paula
 */
public class MainContador2 {
    public static void main(String[] args) {
        Contador2 recurso = new Contador2();
        Persona2 julia = new Persona2(recurso, "Julia", 100);
        Persona2 maria = new Persona2(recurso, "Maria", 300);
        
        Thread hilo1 = new Thread(julia);
        Thread hilo2 = new Thread(maria);
        
        hilo1.start();
        hilo2.start();
        
        try {
            Thread.sleep(100);
            recurso.detener();
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            
        }
        System.out.println("Final del main");
    }
}
