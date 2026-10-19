/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author paula
 */
public class EjemploProceso_con_salida {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd","/c","echo Hola Mundo");
            Process proceso = pb.start();
            BufferedReader lector = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea = lector.readLine(); 

            while (linea != null && linea != "") {
                System.out.println("HIJO: " + linea);
                linea = lector.readLine();
            };
            int codigo = proceso.waitFor(); 
            System.out.println("Codigo del proceso: " + codigo);
           
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
