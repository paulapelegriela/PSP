/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.ejemploAparcamientoSemaforos;

/**
 *
 * @author paula
 */
public class Main {
    public static void main(String[] args) {
        Aparcamiento aparcamiento = new Aparcamiento();
        
        //creamos los 6 coches
        for (int i = 0; i < 6; i++) {
            Coche coche = new Coche(i, aparcamiento);
            Thread hilo= new Thread(coche);
            hilo.start();
        }
    }
}
