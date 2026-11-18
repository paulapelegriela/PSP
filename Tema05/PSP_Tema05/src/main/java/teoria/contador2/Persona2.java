/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria.contador2;

import teoria.contador2.Contador2;

/**
 *
 * @author paula
 */
public class Persona2 implements Runnable {
    
   private Contador2 cont;
   private String name;
   private int limite;

   //cosntructor
    public Persona2(Contador2 cont,String name, int limite) {
        this.cont = cont;
        this.name = name;
        this.limite = limite;
    }
    
    @Override
    public void run(){
        contar();
    }
    
    public void contar(){
        for (int i = 1; i < limite; i++) {
            cont.incrementar();
        }
       
    }
}
