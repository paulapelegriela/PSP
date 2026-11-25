/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaUsandoTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author paula
 */
public class Servidor {
    public static void main(String[] args) {
        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        DataOutputStream out;
        
        //puerto del servidor (se tiene q poner en mayusc)
        final int PUERTO = 5002;
        
        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");
            
            //hacemos un while true para que se quede dando vueltas para "siempre", vamos que siempre atiende a las peticiones del cliente
            while(true){
                
                //Espera a que un cliente se conecte
                sc = servidor.accept();
                System.out.println("Cliente conectado con éxito");
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());
                
                //Lee el mensaje que me envía
                String mensaje = in.readUTF();
                System.out.println(mensaje);
                
                out.writeUTF("Hola! soy el servidor jiji");
                
                sc.close();
                System.out.println("Cliente desconectado");
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
     
    }
}
