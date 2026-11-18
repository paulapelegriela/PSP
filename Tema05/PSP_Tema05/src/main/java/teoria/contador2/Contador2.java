/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.contador2;

/**
 *
 * @author paula
 */
public class Contador2 {
    
    private int valorActual;
    private volatile boolean detenido;

    //constructor inicializando a 0 el valorActual y a false el detenido.
    public Contador2() {
        valorActual = 0;
        detenido = false;
    }
    
    //utilizariamos synchronized si no tuvieramos volatile. -->  public synchronized void incrementar(){
    public void incrementar(){
        if(!detenido){
            valorActual++;
        }else{
            System.out.println("El contador fue detenido");        }
        System.out.println("El valor actual es: " + valorActual);
    }

    //getter de ValorActual
    public int getValorActual() {
        return valorActual;
    }
    
    public void detener(){
        detenido = true;
    }
    
    
}
