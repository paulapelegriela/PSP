/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria;

/**
 *
 * @author paula
 */
public class Main {
    
    public static void main(String[] args) {
        
        //creamos objetos de tipo Persona
        Persona per1 = new Persona("Julia");
        Persona per2 = new Persona("Angela");
        Persona per3 = new Persona("Maria");
        
        //ahora, si inicializamos los objetos con un .run() no se inicializan a la vez, 
        //como queremos que se inicializaen/ejecuten a la vez usamos .start() 
        
        per1.start();
        per2.start();
        per3.start();
        
        //pero esto puede causar condiciones de carrera, para ello utilizaremos syncronized & join
    }
            
    
}
