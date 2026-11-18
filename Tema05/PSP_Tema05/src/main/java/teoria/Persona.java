/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria;

/**
 *
 * @author paula
 */

//PRIMERA VERSION
public class Persona extends Thread{
    
    String name;

    public Persona(String name) {
        this.name = name;
    }
    
    //run() es un metodo que extiende de Thread (por eso lo sobreescribimos) y se inicializa en el main con un .start
    @Override
    public void run(){ 
        System.out.println(name + " empieza a crecer");
        for (int edad = 0; edad < 10; edad++){
            System.out.println(name + " tiene " + edad + " anios.");
            try {
                Thread.sleep((int)(Math.random()*5000+1000));
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
                    
        }
            
    }
}
