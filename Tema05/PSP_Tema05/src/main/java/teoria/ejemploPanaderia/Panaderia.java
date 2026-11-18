/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.ejemploPanaderia;

/**
 *
 * @author paula
 */
public class Panaderia {
    private boolean hayPan = false;
    
    public synchronized void esperarPan(String nombre){
        while(!hayPan){
            try {
                System.out.println(nombre + ": jopetas no hay pan... pues me quedo esperando jiji");
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println(nombre + ": toma ya! hay pan! me lo llevooo!!!");
    }
    
    public synchronized void hacerPan(){
        System.out.println("Soy el panadero y estoy haciendo pan, jeje!!!");
        hayPan = true;
        System.out.println("Oye que el pan ya esta preparado!!");
        notifyAll();
    }
}
