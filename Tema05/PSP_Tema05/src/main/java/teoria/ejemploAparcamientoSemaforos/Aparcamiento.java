/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.ejemploAparcamientoSemaforos;
import java.util.concurrent.Semaphore;
/**
 *
 * @author paula
 */
public class Aparcamiento {
    private Semaphore plazas;
    private boolean [] ocupadas = new boolean [3]; //array para saber si estan o no estan ocupadas nuestras tres plazas
    
    //crear el constructor para que inicialice el semaforo
    public Aparcamiento() {
        plazas = new Semaphore(3, true); //el nuevo flag true esta por defecto en false siempre, esto hace que de preferencia al hilo que más lleva esperando
    }
    
    //metodo para entrar a la plaza
    public int entrar(int coche) throws InterruptedException{
        System.out.println("Coche " + coche + " quiere entrar");
        
        plazas.acquire(); //recordar: "si hay permisos, el hilo consigue uno
        
        synchronized (this){
        //buscar la plaza libre
            for (int i = 0; i < ocupadas.length; i++) {
                if(!ocupadas[i]){
                    ocupadas [i] = true;
                    System.out.println("Coche " + coche + " entra en la plaza " + i);
                    return i;
                }
            }
        }
        return -1; //devolvemos el -1 que significa que la plaza no esta ocupada
    }
    
    public synchronized void salir(int coche, int plaza){
        ocupadas[plaza]=false;
        System.out.println("Coche "+ coche + " se va de la plaza " + plaza);
        plazas.release(); //libera un permiso
    }
}

