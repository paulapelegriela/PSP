/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.Contador;

/**
 *
 * @author paula
 */

//Esta clase con sirve para saber si el hilo está o no está trabajando
public class Contador implements Runnable{
    private boolean isWorking;

    //en el constructor hacemos que se inicialize nuestra variable con false
    public Contador() {
        this.isWorking = false;
    }
    
    //funfact --> si no sobreescribimos este método e implementados Runnable nos sale un error (porq es el unico metodo q tiene dentro)
    @Override
    public void run(){
        iniciarContador();
    }
    public void iniciarContador(){
        System.out.println("Iniciando el contador...");
        try {
            this.isWorking = true;
            for (int i = 0; i < 1000; i++) {
                System.out.println("Contador" + i);
                Thread.sleep(1000);
            }
            this.isWorking = false;
        } catch (InterruptedException e) { //reminder-->para los Thread se utiliza Interrupted!!
            System.out.println(e);
        }
    }
    
    //este metodo es solo para devolver el estado de la variable anterior.
    public boolean isWorking(){
        return isWorking;
    }
}
