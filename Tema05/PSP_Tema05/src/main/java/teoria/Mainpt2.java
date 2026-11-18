/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria;

/**
 *
 * @author paula
 */
public class Mainpt2 {
    
        public static void main(String[] args) {
        
        //creamos objetos de tipo Persona
        Personapt2 per1 = new Personapt2("Julia");
        Personapt2 per2 = new Personapt2("Angela");
        Personapt2 per3 = new Personapt2("Maria");
        
        //ahora, si inicializamos los objetos con un .run() no se inicializan a la vez, 
        //como queremos que se inicializaen/ejecuten a la vez usamos .start() 
        
        //En esta version al usar "implements Runnable" necesitamos crear los objetos de tipo Thread, para poder usar start.
        Thread hilo1 = new Thread(per1);
        Thread hilo2 = new Thread(per2);
        Thread hilo3 = new Thread(per3);
        
        //ahora al inicializar lo que inicializamos son los hilos que definimos con los objetos de Persona.
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        //pero esto puede causar condiciones de carrera, para ello utilizaremos syncronized & join
    }
}
