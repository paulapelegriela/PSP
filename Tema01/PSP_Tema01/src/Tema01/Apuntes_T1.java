/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema01;

import java.io.IOException;

/**
 *
 * @author paula
 */
public class Apuntes_T1 {
    public static void main(String[] args) {
        /**
         * La clase Runtime en java permite que una aplicación interactue con el JMV.
         * Sirve para:
         *  - Ejecutar comandos.
         *  - Consultar memoria.
         *  - Registrar tareas de apagado.
        */
    try {
        Runtime runtime = Runtime.getRuntime();
        Process proceso = runtime.exec("ping www.google.es");
                
        int estadoSalida = proceso.waitFor(); //Espera que el proceso termine --> 0 correcto, 1,2 --> algun problema
        System.out.println("comprobar si es 0" + estadoSalida);
    }
    catch(IOException | InterruptedException e){
        System.out.println("Se ha producido un error" + e.getMessage());
    }
    }//main
}//clase
