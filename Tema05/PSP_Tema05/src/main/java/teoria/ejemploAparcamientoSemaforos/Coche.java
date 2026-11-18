/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.ejemploAparcamientoSemaforos;

/**
 *
 * @author paula
 */
public class Coche implements Runnable{
    private int id;
    private Aparcamiento aparcamiento;

    public Coche(int id, Aparcamiento aparcameinto) {
        this.id = id;
        this.aparcamiento = aparcameinto;
    }
    
    @Override 
    
    public void run() {
        int plaza = -1;
        try {
            plaza = aparcamiento.entrar(id);
            // Permanece aparcado 3 segundos
            Thread.sleep(3000);
            aparcamiento.salir(id, plaza);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
