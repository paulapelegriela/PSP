/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.ejemploPanaderia;

/**
 *
 * @author paula
 */
public class Main {
    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia();
        //La forma de implementar el Runnable con lambda es ()->, es lo mismo que hacer lo de implementar Runnable vaya
        Thread cliente1 = new Thread(()-> panaderia.esperarPan("Cliente 1"));
        Thread cliente2 = new Thread(()-> panaderia.esperarPan("Cliente 2"));
        Thread cliente3 = new Thread(()-> panaderia.esperarPan("Cliente 3"));
        
        cliente1.start();
        cliente2.start();
        cliente3.start();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        Thread panadero = new Thread(()->panaderia.hacerPan());
        panadero.start();
    }
}
