/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaUsandoUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author paula
 */
public class Cliente {
    public static void main(String[] args) {
        final int PUERTO_SERVIDOR = 5003;
        byte[] buffer = new byte[1024];
        
        try {
            //creamos la localización de localhost
            InetAddress direccionServidor = InetAddress.getByName("localhost");
            
            //Creamos el socket de udp
            DatagramSocket socketUDP = new DatagramSocket();
            String mensaje = "Hola mundo! Desde el cliente juju";
            
            //convertimos el mensaje a bytes y creamos el datagrama
            buffer = mensaje.getBytes();
            DatagramPacket pregunta = new DatagramPacket(buffer, buffer.length);
            
            //lo enviamos con send
            System.out.println("Envio del datagrama");
            socketUDP.send(pregunta);
            
            //preparamos la respuesta
            DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
            
            //Recibo la respuesta
            socketUDP.receive(peticion);
            System.out.println("Petición recibida!!");
            
            //cogemos los datos y los mostramos
            mensaje = new String(peticion.getData());
            System.out.println(mensaje);
            
            
        } catch (Exception e) {
        }
     
    }

    
    
}
