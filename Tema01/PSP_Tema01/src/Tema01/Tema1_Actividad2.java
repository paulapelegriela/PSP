package Tema01; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author paula
 */
public class Tema1_Actividad2 {
    public static void main(String[] args) {
         try {
            ProcessBuilder builder = new ProcessBuilder("cmd", "/c", "dir C:\\DAM2\\PSP"); 
            Process proceso = builder.start();

            BufferedReader entrada = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
             String linea = entrada.readLine(); 

            while (linea != null && linea != "") {
                System.out.println(linea);
                linea = entrada.readLine();
            };

            int estadoSalida = proceso.waitFor(); //Espera que el proceso termine --> 0 correcto, 1,2 --> algun problema
            System.out.println("El proceso ha salido con: " + estadoSalida);
            entrada.close();
         }
        catch (IOException | InterruptedException e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
    }
}
