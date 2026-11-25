/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaUsandoTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author paula
 */
public class Cliente {
    
    public static void main(String[] args) {
        final String HOST = "127.0.0.1";
        final int PUERTO = 5002;
        DataInputStream in;
        DataOutputStream out;
        
        try {
            //Creamos el socket para conectarnos al servidor
            Socket sc = new Socket(HOST, PUERTO);
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());
            
            //Enviamos un mensaje al servidor
            out.writeUTF("Hola! soy el cliente jiji");
            
            //Recibimos el mensaje del servidor y lo sacamos por pantalla
            String mensaje = in.readUTF();
            System.out.println(mensaje);
            
            //cerramos el socket
            sc.close();
          
        } catch (Exception e) {
            System.out.println("Error!!!");
        }
    
    }

    
}
